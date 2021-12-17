package com.djontleman.label;

import com.djontleman.album.Album;
import com.djontleman.album.AlbumDAO;
import com.djontleman.exception.BadRequestException;
import com.djontleman.exception.ResourceNotFoundException;
import com.djontleman.song.Song;
import com.djontleman.song.SongDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Service
public class LabelService {

    private LabelDAO labelDAO;
    private AlbumDAO albumDAO;
    private SongDAO songDAO;

    @Autowired
    public LabelService(@Qualifier("postgresLabel") LabelDAO labelDAO,
                        @Qualifier("postgresAlbum") AlbumDAO albumDAO,
                        @Qualifier("postgresSong") SongDAO songDAO) {
        this.labelDAO = labelDAO;
        this.albumDAO = albumDAO;
        this.songDAO = songDAO;
    }

    // || ====================== Create/POST ====================== ||

    public int postLabel(Label label) {
        if (label.getName() == null || label.getName().length() <= 0) {
            throw new BadRequestException("Label name cannot be empty");
        }
        return labelDAO.postLabel(label);
    }

    // || ====================== Read/GET ====================== ||

    public List<Label> getAllLabels() {
        List<Label> labels = labelDAO.getAllLabels();

        labels.forEach(label -> {
            List<Album> albumList = albumDAO.getAlbumsByLabelId(label.getId());

            albumList.forEach(album -> {
                List<Song> songList = songDAO.getSongsByAlbumId(album.getId());
                album.setSongList(songList);
            });

            label.setAlbumList(albumList);
        });

        return labels;
    }

    public Optional<Label> getLabelById(int id) {
        Optional<Label> labelOptional = labelDAO.getLabelById(id);
        if (labelOptional.isEmpty()) {
            throw new ResourceNotFoundException("No label with ID: " + id);
        }

        Label label = labelOptional.get();

        List<Album> albumList = albumDAO.getAlbumsByLabelId(label.getId());
        albumList.forEach(album -> {
            List<Song> songList = songDAO.getSongsByAlbumId(album.getId());
            album.setSongList(songList);
        });

        label.setAlbumList(albumList);

        return Optional.of(label);
    }

    // || ====================== Update/PUT/PATCH ====================== ||

    public int putLabel(int id, Label label) {
        Optional<Label> labelOptional = labelDAO.getLabelById(id);
        if (labelOptional.isEmpty()) {
            throw new ResourceNotFoundException("No label with ID: " + id);
        }

        if (label.getName() == null || label.getName().length() <= 0) {
            throw new BadRequestException("Label name cannot be empty");
        }

        return labelDAO.putLabel(id, label);
    }

    // || ====================== Delete/DELETE ====================== ||

    public int deleteLabel(int id) {
        Optional<Label> label = labelDAO.getLabelById(id);
        if (label.isEmpty()) {
            throw new ResourceNotFoundException("No label with ID: " + id);
        }
        return labelDAO.deleteLabel(id);
    }
}

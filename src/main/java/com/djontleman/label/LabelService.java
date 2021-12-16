package com.djontleman.label;

import com.djontleman.album.Album;
import com.djontleman.album.AlbumDAO;
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

    @Autowired
    public LabelService(@Qualifier("postgresLabel") LabelDAO labelDAO,
                        @Qualifier("postgresAlbum") AlbumDAO albumDAO) {
        this.labelDAO = labelDAO;
        this.albumDAO = albumDAO;
    }

    // || ====================== Create/POST ====================== ||

    public int postLabel(Label label) {
        return labelDAO.postLabel(label);
    }

    // || ====================== Read/GET ====================== ||

    public List<Label> getAllLabels() {
        List<Label> labels = labelDAO.getAllLabels();

        labels.forEach(label -> {
            List<Album> albumList = albumDAO.getAlbumsByLabelId(label.getId());
            label.setAlbumList(albumList);
        });

        return labels;
    }

    public Optional<Label> getLabelById(int id) {
        Optional<Label> labelOptional = labelDAO.getLabelById(id);

        Label label = labelOptional.get();
        List<Album> albumList = albumDAO.getAlbumsByLabelId(label.getId());
        label.setAlbumList(albumList);

        return Optional.of(label);
    }

    // || ====================== Update/PUT/PATCH ====================== ||

    public int putLabel(int id, Label label) {
        return labelDAO.putLabel(id, label);
    }

    // || ====================== Delete/DELETE ====================== ||

    public int deleteLabel(int id) {
        return labelDAO.deleteLabel(id);
    }
}

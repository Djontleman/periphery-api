package com.djontleman.song;

import com.djontleman.album.Album;
import com.djontleman.album.AlbumDAO;
import com.djontleman.exception.BadRequestException;
import com.djontleman.exception.ResourceNotFoundException;
import com.djontleman.label.Label;
import com.djontleman.label.LabelDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static com.djontleman.album.AlbumService.getAlbumDuration;

@Service
public class SongService {

    private SongDAO songDAO;
    private AlbumDAO albumDAO;
    private LabelDAO labelDAO;

    @Autowired
    public SongService(@Qualifier("postgresSong") SongDAO songDAO,
                       @Qualifier("postgresAlbum") AlbumDAO albumDAO,
                       @Qualifier("postgresLabel") LabelDAO labelDAO) {
        this.songDAO = songDAO;
        this.albumDAO = albumDAO;
        this.labelDAO = labelDAO;
    }

    // || ====================== Create/POST ====================== ||

    public int postSong(Song song) {
        if (song.getName() == null || song.getName().length() <= 0) {
            throw new BadRequestException("Song name cannot be empty");
        }
        if (song.getDuration() == null) {
            throw new BadRequestException("Song duration cannot be null");
        }
        return songDAO.postSong(song);
    }

    // || ====================== Read/GET ====================== ||

    public List<Song> getAllSongs() {
        List<Song> songs = songDAO.getAllSongs();
        songs.forEach(song -> {
            List<Album> albumsOn = albumDAO.getAlbumsBySongId(song.getId());

            albumsOn.forEach(album -> {
                List<Label> labels = labelDAO.getLabelsByAlbumId(album.getId());
                album.setLabels(labels);
            });

            // logic to display duration of albums in albumsOn
//            albumsOn.forEach(album -> {
//                List<Song> songList = songDAO.getSongsByAlbumId(album.getId());
//                album.setDuration(getAlbumDuration(songList));
//            });

            song.setAlbumsOn(albumsOn);
        });
        return songs;
    }

    public Optional<Song> getSongById(int id) {
        Optional<Song> songOptional = songDAO.getSongById(id);
        if (songOptional.isEmpty()) {
            throw new ResourceNotFoundException("No song with ID: " + id);
        }

        Song song = songOptional.get();

        List<Album> albumsOn = albumDAO.getAlbumsBySongId(song.getId());
        albumsOn.forEach(album -> {
            List<Label> labels = labelDAO.getLabelsByAlbumId(album.getId());
            album.setLabels(labels);
        });

        // logic to display duration of albums in albumsOn
//        albumsOn.forEach(album -> {
//            List<Song> songList = songDAO.getSongsByAlbumId(album.getId());
//            album.setDuration(getAlbumDuration(songList));
//        });

        song.setAlbumsOn(albumsOn);

        return Optional.of(song);
    }

    // || ====================== Update/PUT ====================== ||

    public int putSong(int id, Song song) {
        Optional<Song> songOptional = songDAO.getSongById(id);
        if (songOptional.isEmpty()) {
            throw new ResourceNotFoundException("No song with ID: " + id);
        }

        if (song.getName() == null || song.getName().length() <= 0) {
            throw new BadRequestException("Song name cannot be empty");
        }
        if (song.getDuration() == null) {
            throw new BadRequestException("Song duration cannot be null");
        }

        return songDAO.putSong(id, song);
    }

    // || ====================== Delete/DELETE ====================== ||

    public int deleteSong(int id) {
        Optional<Song> song = songDAO.getSongById(id);
        if (song.isEmpty()) {
            throw new ResourceNotFoundException("No song with ID: " + id);
        }
        return songDAO.deleteSong(id);
    }
}

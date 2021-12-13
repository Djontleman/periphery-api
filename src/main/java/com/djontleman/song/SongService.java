package com.djontleman.song;

import com.djontleman.album.AlbumDAO;
import com.djontleman.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SongService {

    private SongDAO songDAO;
    private AlbumDAO albumDAO;

    @Autowired
    public SongService(@Qualifier("postgresSong") SongDAO songDAO, @Qualifier("postgresAlbum") AlbumDAO albumDAO) {
        this.songDAO = songDAO;
        this.albumDAO = albumDAO;
    }

    // || ====================== Create/POST ====================== ||

    public int postSong(Song song) {
        return songDAO.postSong(song);
    }

    // || ====================== Read/GET ====================== ||

    public List<Song> getAllSongs() {
        List<Song> songs = songDAO.getAllSongs();
        songs.forEach(song -> song.setAlbumsOn(albumDAO.getAlbumsBySongId(song.getId())));
        return songs;
    }

    public Optional<Song> getSongById(int id) {
        Optional<Song> songOptional = songDAO.getSongById(id);
        if (songOptional.isEmpty()) {
            throw new ResourceNotFoundException("No song with ID: " + id);
        }
        Song song = songOptional.get();
        song.setAlbumsOn(albumDAO.getAlbumsBySongId(id));
        return Optional.of(song);
    }

    // || ====================== Update/PUT ====================== ||

    public int putSong(int id, Song song) {
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

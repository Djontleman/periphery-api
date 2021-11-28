package com.djontleman.song;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SongService {

    private SongDAO songDAO;

    @Autowired
    public SongService(@Qualifier("postgresSong") SongDAO songDAO) {
        this.songDAO = songDAO;
    }

    // || ====================== Read/GET ====================== ||

    public List<Song> getAllSongs() {
        return songDAO.getAllSongs();
    }

    public Optional<Song> getSongById(int id) {
        return songDAO.getSongById(id);
    }
}

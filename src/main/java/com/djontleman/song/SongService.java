package com.djontleman.song;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongService {

    private SongDAO songDAO;

    @Autowired
    public SongService(@Qualifier("postgresSong") SongDAO songDAO) {
        this.songDAO = songDAO;
    }

    public List<Song> getAllSongs() {
        return songDAO.getAllSongs();
    }
}

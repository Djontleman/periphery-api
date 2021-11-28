package com.djontleman.song;

import java.util.List;
import java.util.Optional;

public interface SongDAO {

    // || ====================== Read/GET ====================== ||

    public List<Song> getAllSongs();
    public Optional<Song> getSongById(int id);
}

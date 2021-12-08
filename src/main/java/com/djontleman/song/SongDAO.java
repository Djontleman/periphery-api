package com.djontleman.song;

import java.util.List;
import java.util.Optional;

public interface SongDAO {

    // || ====================== Create/POST ====================== ||

    public int postSong(Song song);

    // || ====================== Read/GET ====================== ||

    public List<Song> getAllSongs();
    public Optional<Song> getSongById(int id);
    public List<Song> getSongsByAlbumId(int id);

    // || ====================== Update/PUT ====================== ||

    public int putSong(int id, Song song);

    // || ====================== Delete/DELETE ====================== ||

    public int deleteSong(int id);
}

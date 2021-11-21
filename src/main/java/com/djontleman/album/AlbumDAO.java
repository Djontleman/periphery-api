package com.djontleman.album;

import java.util.List;
import java.util.Optional;

public interface AlbumDAO {
    public List<Album> getAllAlbums();
    public List<Album> getAllAlbumsWhereAlbumType(AlbumType albumType);
    public Optional<Album> getAlbumById(int id);
}

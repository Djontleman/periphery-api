package com.djontleman.album;

import java.util.List;
import java.util.Optional;

public interface AlbumDAO {

    // || ====================== Create/POST ====================== ||

    public int postAlbum(Album album);

    // || ====================== Read/GET ====================== ||

    public List<Album> getAllAlbums();
    public int getCountAllAlbums();
    public List<Album> getAllAlbumsWhereAlbumType(AlbumType albumType);
    public int getCountAlbumsWhereAlbumType(AlbumType albumType);
    public Optional<Album> getAlbumById(int id);
}

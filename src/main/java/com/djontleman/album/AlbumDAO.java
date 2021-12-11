package com.djontleman.album;

import java.util.List;
import java.util.Optional;

public interface AlbumDAO {

    // || ====================== Create/POST ====================== ||

    public int postAlbum(Album album);

    // || ====================== Read/GET ====================== ||

    public List<Album> getAllAlbums();
    public List<Album> getAllAlbumsWhereAlbumType(AlbumType albumType);
    public int getCountAllAlbums();
    public int getCountAlbumsWhereAlbumType(AlbumType albumType);
    public Optional<Album> getAlbumById(int id);
    public List<Album> getAlbumsBySongId(int id);

    // || ====================== Update/PUT/PATCH ====================== ||

    public int putAlbum(int id, Album album);

    // || ====================== Delete/DELETE ====================== ||

    public int deleteAlbum(int id);
}

package com.djontleman.album;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlbumService {

    private AlbumDAO albumDAO;

    @Autowired
    public AlbumService(@Qualifier("postgres") AlbumDAO albumDAO) {
        this.albumDAO = albumDAO;
    }

    public List<Album> getAllAlbums() {
        return albumDAO.getAllAlbums();
    }
}

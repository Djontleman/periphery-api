package com.djontleman.album;

import com.djontleman.exception.BadRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Locale;
import java.util.Optional;

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

    public List<Album> getAllAlbums(String albumTypeString) {
        if (albumTypeString != null) {
            String albumTypeStringCap =
                    albumTypeString.substring(0, 1).toUpperCase() + albumTypeString.substring(1);
            AlbumType albumType;
            try {
                albumType = AlbumType.valueOf(albumTypeString.toUpperCase());
            } catch (IllegalArgumentException e) {
                throw new BadRequestException(
                        albumTypeStringCap + " is not a valid album type."
                );
            }
            return albumDAO.getAllAlbumsWhereAlbumType(albumType);
        } else {
            return albumDAO.getAllAlbums();
        }
    }

    public Optional<Album> getAlbumById(int id) {
        return albumDAO.getAlbumById(id);
    }
}

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

    public List<Album> getAllAlbums(String albumTypeString) {

        if (albumTypeString != null && albumTypeString.length() > 0) { // if parameter defined
            AlbumType albumType;
            try {
                albumType = AlbumType.valueOf(albumTypeString.toUpperCase()); // try to parse AlbumType
            } catch (IllegalArgumentException e) {
                throw new BadRequestException(
                        albumTypeString.toUpperCase() + " is not a valid album type."
                );
            }
            return albumDAO.getAllAlbumsWhereAlbumType(albumType);
        } else {
            return albumDAO.getAllAlbums(); // if no parameter return all albums
        }
    }

    public Optional<Album> getAlbumById(int id) {
        return albumDAO.getAlbumById(id);
    }
}

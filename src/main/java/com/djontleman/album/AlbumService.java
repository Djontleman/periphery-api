package com.djontleman.album;

import com.djontleman.exception.BadRequestException;
import com.djontleman.exception.ResourceNotFoundException;
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

    /* Get All Albums
        If no parameter:
            Get a list of all albums
        If parameter AlbumType:
            Get a list of all albums with the given album type
            Throw Bad Request if album type is not valid
        */
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
            return albumDAO.getAllAlbumsWhereAlbumType(albumType); // return where album type
        } else {
            return albumDAO.getAllAlbums(); // if no parameter return all albums
        }
    }

    public int getCountAllAlbums(String albumTypeString) {
        if (albumTypeString != null && albumTypeString.length() > 0) { // if parameter defined
            AlbumType albumType;
            try {
                albumType = AlbumType.valueOf(albumTypeString.toUpperCase()); // try to parse AlbumType
            } catch (IllegalArgumentException e) {
                throw new BadRequestException(
                        albumTypeString.toUpperCase() + " is not a valid album type."
                );
            }
            return albumDAO.getCountAlbumsWhereAlbumType(albumType); // return count with album type
        } else {
            return albumDAO.getCountAllAlbums(); // if no parameter return count of all albums
        }
    }

    public Optional<Album> getAlbumById(int id) {
        return albumDAO.getAlbumById(id);
    }
}

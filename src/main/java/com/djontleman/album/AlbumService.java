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

    // || ====================== Create/POST ====================== ||

    public int postAlbum(Album album) {
        if (album.getName() == null || album.getName().length() <= 0) {
            throw new BadRequestException("Album name cannot be empty");
        }
        if (album.getReleaseDate() == null) {
            throw new BadRequestException("Album release date cannot be null");
        }
        if (album.getDuration() == null) {
            throw new BadRequestException("Album duration cannot be null");
        }
        return albumDAO.postAlbum(album);
    }

    // || ====================== Read/GET ====================== ||

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
        Optional<Album> album = albumDAO.getAlbumById(id);
        if (album.isEmpty()) {
            throw new ResourceNotFoundException("No album with ID: " + id);
        }
        return album;
    }

    // || ====================== Update/PUT/PATCH ====================== ||

    public int putAlbum(int id, Album album) {

        // check album with id exists
        Optional<Album> albumToBeUpdated = albumDAO.getAlbumById(id);
        if (albumToBeUpdated.isEmpty()) {
            throw new ResourceNotFoundException("No album with ID: " + id);
        }

        // validate input
        if (album.getName() == null || album.getName().length() <= 0) {
            throw new BadRequestException("Album name cannot be empty");
        }
        if (album.getReleaseDate() == null) {
            throw new BadRequestException("Album release date cannot be null");
        }
        if (album.getDuration() == null) {
            throw new BadRequestException("Album duration cannot be null");
        }
        return albumDAO.putAlbum(id, album);
    }
}

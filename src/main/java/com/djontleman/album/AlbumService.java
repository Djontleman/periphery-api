package com.djontleman.album;

import com.djontleman.exception.BadRequestException;
import com.djontleman.exception.ResourceNotFoundException;
import com.djontleman.song.SongDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlbumService {

    private AlbumDAO albumDAO;
    private SongDAO songDAO;

    @Autowired
    public AlbumService(@Qualifier("postgresAlbum") AlbumDAO albumDAO, @Qualifier("postgresSong") SongDAO songDAO) {
        this.albumDAO = albumDAO;
        this.songDAO = songDAO;
    }

    // || ====================== Create/POST ====================== ||

    public int postAlbum(Album album) {
        if (album.getName() == null || album.getName().length() <= 0) {
            throw new BadRequestException("Album name cannot be empty");
        }
        if (album.getType() == null) {
            throw new BadRequestException("Album type cannot be null");
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

    public List<Album> getAllAlbums(AlbumType albumType) {
        if (albumType != null) { // if parameter defined
            return albumDAO.getAllAlbumsWhereAlbumType(albumType); // return where album type
        } else {
            return albumDAO.getAllAlbums(); // if no parameter return all albums
        }
    }

    public int getCountAllAlbums(AlbumType albumType) {
        if (albumType != null) { // if parameter defined
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
        if (album.getType() == null) {
            throw new BadRequestException("Album type cannot be null");
        }
        if (album.getReleaseDate() == null) {
            throw new BadRequestException("Album release date cannot be null");
        }
        if (album.getDuration() == null) {
            throw new BadRequestException("Album duration cannot be null");
        }
        return albumDAO.putAlbum(id, album);
    }

    // || ====================== Delete/DELETE ====================== ||

    public int deleteAlbum(int id) {
        // check album with id exists
        Optional<Album> albumToBeUpdated = albumDAO.getAlbumById(id);
        if (albumToBeUpdated.isEmpty()) {
            throw new ResourceNotFoundException("No album with ID: " + id);
        }
        return albumDAO.deleteAlbum(id);
    }
}

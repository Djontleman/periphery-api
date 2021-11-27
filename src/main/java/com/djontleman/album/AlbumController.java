package com.djontleman.album;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/albums")
public class AlbumController {

    private AlbumService albumService;

    @Autowired
    public AlbumController(AlbumService albumService) {
        this.albumService = albumService;
    }

    // || ====================== Create/POST ====================== ||

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void postAlbum(@RequestBody Album album) {
        albumService.postAlbum(album);
    }

    // || ====================== Read/GET ====================== ||

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Album> getAllAlbums(@RequestParam(required = false) String type) {
        return albumService.getAllAlbums(type);
    }

    @GetMapping("count")
    @ResponseStatus(HttpStatus.OK)
    public int getCountAllAlbums(@RequestParam(required = false) String type) {
        return albumService.getCountAllAlbums(type);
    }

    @GetMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<Album> getAlbumById(@PathVariable int id) {
        return albumService.getAlbumById(id);
    }

    // || ====================== Update/PUT/PATCH ====================== ||

    @PutMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void putAlbum(@PathVariable int id, @RequestBody Album album) {
        albumService.putAlbum(id, album);
    }

    // || ====================== Delete/DELETE ====================== ||

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteAlbum(@PathVariable int id) {
        albumService.deleteAlbum(id);
    }

}

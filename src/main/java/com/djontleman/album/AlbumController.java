package com.djontleman.album;

import org.springframework.beans.factory.annotation.Autowired;
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

    @GetMapping
    public List<Album> getAllAlbums(@RequestParam(required = false) String type) {
        return albumService.getAllAlbums(type);
    }

    @GetMapping("{id}")
    public Optional<Album> getAlbumById(@PathVariable int id) {
        return albumService.getAlbumById(id);
    }
}

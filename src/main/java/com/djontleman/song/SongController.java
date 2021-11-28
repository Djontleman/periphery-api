package com.djontleman.song;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/songs")
public class SongController {

    private SongService songService;

    @Autowired
    public SongController(SongService songService) {
        this.songService = songService;
    }

    // || ====================== Create/POST ====================== ||

    @PostMapping
    public void postSong(@RequestBody Song song) {
        songService.postSong(song);
    }

    // || ====================== Read/GET ====================== ||

    @GetMapping
    public List<Song> getAllSongs() {
        return songService.getAllSongs();
    }

    @GetMapping("{id}")
    public Optional<Song> getSongById(@PathVariable("id") int id) {
        return songService.getSongById(id);
    }
}

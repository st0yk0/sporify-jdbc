package com.spotify.song.rest;


import com.spotify.song.repository.Song;
import com.spotify.song.service.SongService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/songs")
public class SongController {

    private final SongService songService;

    public SongController(SongService songService) {
        this.songService = songService;
    }

    @PostMapping
    public void addSong(Song song) {
        songService.addSong(song);
    }

    @DeleteMapping("/{id}")
    public void deleteSong(int id) {
        songService.deleteSong(id);
    }

    @GetMapping("/{id}")
    public Song getSong(int id) {
        return songService.getSong(id);
    }

    @GetMapping
    public List<Song> getAllSongs() {
        return songService.getAllSongs();
    }

    @PutMapping
    public void update(Song song) {
        songService.update(song);
    }
}

package com.spotify.artist.rest;


import com.spotify.artist.repository.Artist;
import com.spotify.artist.service.ArtistService;
import com.spotify.user.repository.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/artists")
public class ArtistController {

    private final ArtistService artistService;

    public ArtistController(ArtistService artistService) {
        this.artistService = artistService;
    }

    @PostMapping
    public void addArtist(Artist artist) {
        artistService.addArtist(artist);
    }

    @DeleteMapping("/{id}")
    public void deleteArtist(int id) {
        artistService.deleteArtist(id);
    }

    @GetMapping("/{id}")
    public Artist getArtist(int id) {
        return artistService.getArtist(id);
    }

    @GetMapping
    public List<Artist> getAllArtists() {
        return artistService.getAllArtists();
    }

    @PutMapping
    public void update(Artist artist) {
        artistService.update(artist);
    }
}

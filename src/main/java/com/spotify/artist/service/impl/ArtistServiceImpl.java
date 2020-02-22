package com.spotify.artist.service.impl;

import com.spotify.artist.repository.Artist;
import com.spotify.artist.repository.ArtistRepository;
import com.spotify.artist.service.ArtistService;
import com.spotify.song.repository.Song;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArtistServiceImpl implements ArtistService {

    private final ArtistRepository artistRepository;

    public ArtistServiceImpl(ArtistRepository artistRepository) {
        this.artistRepository = artistRepository;
    }


    @Override
    public void addArtist(Artist artist) {
        artistRepository.add(artist);
    }

    @Override
    public void deleteArtist(int id) {
        artistRepository.delete(id);
    }

    @Override
    public Artist getArtist(int id) {
        return artistRepository.get(id);
    }

    @Override
    public List<Artist> getAllArtists() {
        return artistRepository.getAll();
    }

    @Override
    public void update(Artist artist) {
        artistRepository.update(artist);
    }
}

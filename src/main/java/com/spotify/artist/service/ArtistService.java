package com.spotify.artist.service;

import com.spotify.artist.repository.Artist;
import com.spotify.song.repository.Song;
import com.spotify.user.repository.User;

import java.util.List;

public interface ArtistService {

    void addArtist(Artist artist);

    void deleteArtist(int id);

    Artist getArtist(int id);

    List<Artist> getAllArtists();

    void update(Artist artist);
}

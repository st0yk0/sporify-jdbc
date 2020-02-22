package com.spotify.song.service;

import com.spotify.artist.repository.Artist;
import com.spotify.song.repository.Song;

import java.util.List;

public interface SongService {

    void addSong(Song song);

    void deleteSong(int id);

    Song getSong(int id);

    List<Song> getAllSongs();

    void update(Song song);
}

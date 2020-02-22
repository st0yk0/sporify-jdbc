package com.spotify.song.service.impl;

import com.spotify.song.repository.Song;
import com.spotify.song.repository.SongRepository;
import com.spotify.song.service.SongService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongServiceImpl implements SongService {

    private final SongRepository songRepository;

    public SongServiceImpl(SongRepository songRepository) {
        this.songRepository = songRepository;
    }

    @Override
    public void addSong(Song song) {
        songRepository.add(song);
    }

    @Override
    public void deleteSong(int id) {
        songRepository.delete(id);
    }

    @Override
    public Song getSong(int id) {
        return songRepository.get(id);
    }

    @Override
    public List<Song> getAllSongs() {
        return songRepository.getAll();
    }

    @Override
    public void update(Song song) {
        songRepository.update(song);
    }
}

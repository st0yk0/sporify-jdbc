package com.spotify.song.repository;

import com.spotify.artist.repository.Artist;
import com.spotify.song.repository.mapper.SongRowMapper;
import com.spotify.user.repository.User;
import com.spotify.user.repository.mapper.UserRowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class SongRepository {

    private final NamedParameterJdbcTemplate jdbcTemplate;

    public SongRepository(NamedParameterJdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void add(final Song song) {
        final String sql = "INSERT INTO songs (song_name, release_date, song_length, artist_id) "
                + "VALUES (:song_name, :release_date, :song_length, :artist_id)";

        final Map<String, Object> params = new HashMap<>();
        params.put("song_name", song.getSongName());
        params.put("release_date", song.getReleaseDate());
        params.put("song_length", song.getSongLength());
        params.put("artist_id", song.getArtistId());

        jdbcTemplate.update(sql, params);
    }

    public void delete(final int id) {
        final String sql = "DELETE FROM songs WHERE id = " + id;

        jdbcTemplate.update(sql, new HashMap<>());
    }

    public Song get(final int id) {
        final String sql = "SELECT * FROM songs WHERE id = " + id;

        return jdbcTemplate.queryForObject(sql, new HashMap<>(), new SongRowMapper());
    }

    public List<Song> getAll() {
        final String sql = "SELECT * FROM songs";

        return jdbcTemplate.query(sql, new SongRowMapper());
    }

    public void update(final Song song) {
        final String sql = "UPDATE songs "
                + "SET song_name = :song_name,"
                + "release_date = :release_date,"
                + "song_length = :song_length,"
                + "artist_id = :artist_id "
                + "WHERE id = :id";

        final Map<String, Object> params = new HashMap<>();
        params.put("id", song.getId());
        params.put("song_name", song.getSongName());
        params.put("release_date", song.getReleaseDate());
        params.put("song_length", song.getSongLength());
        params.put("artist_id", song.getArtistId());

        jdbcTemplate.update(sql, params);
    }

    public String getUserSong(final int id) {
        String sql = "SELECT * FROM songs s WHERE s.id = " + id;
        Song songDetails = jdbcTemplate.queryForObject(sql, new HashMap<>(), new SongRowMapper());
        return songDetails.getSongName();
    }
}

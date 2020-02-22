package com.spotify.song.repository.mapper;

import com.spotify.song.repository.Song;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SongRowMapper implements RowMapper<Song> {

    @Override
    public Song mapRow(ResultSet rs, int i) throws SQLException {

        final Song song = new Song();
        song.setId(rs.getInt("id"));
        song.setSongName(rs.getString("song_name"));
        song.setReleaseDate(rs.getDate("release_date").toLocalDate());
        song.setSongLength(rs.getInt("song_length"));
        song.setArtistId(rs.getInt("artist_id"));

        return song;
    }
}

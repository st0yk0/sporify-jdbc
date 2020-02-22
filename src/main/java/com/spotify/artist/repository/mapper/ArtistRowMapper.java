package com.spotify.artist.repository.mapper;

import com.spotify.artist.repository.Artist;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ArtistRowMapper implements RowMapper<Artist> {

    @Override
    public Artist mapRow(ResultSet rs, int i) throws SQLException {
        final Artist artist = new Artist();
        artist.setId(rs.getInt("id"));
        artist.setFirstName(rs.getString("first_name"));
        artist.setLastName(rs.getString("last_name"));
        artist.setGenre(rs.getString("genre"));

        return artist;
    }
}

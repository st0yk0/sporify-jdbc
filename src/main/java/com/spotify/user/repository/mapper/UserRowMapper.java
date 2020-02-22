package com.spotify.user.repository.mapper;

import com.spotify.user.repository.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserRowMapper implements RowMapper<User> {


    @Override
    public User mapRow(ResultSet rs, int i) throws SQLException {

        final User user = new User();
        user.setId(rs.getInt("id"));
        user.setFirstName(rs.getString("first_name"));
        user.setLastName(rs.getString("last_name"));
        user.setEmail(rs.getString("email"));
        user.setBirthDate(rs.getDate("birth_date").toLocalDate());
        user.setSubscription(rs.getBoolean("subscription"));

        return user;
    }
}

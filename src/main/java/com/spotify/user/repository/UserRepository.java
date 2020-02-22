package com.spotify.user.repository;

import com.spotify.user.repository.mapper.UserRowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class UserRepository {

    private final NamedParameterJdbcTemplate jdbcTemplate;

    public UserRepository(NamedParameterJdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void add(final User user) {
        final String sql = "INSERT INTO users (first_name, last_name, email, birth_date, subscription) "
                + "VALUES (:first_name, :last_name, :email, :birth_date, :subscription)";

        final Map<String, Object> params = new HashMap<>();
        params.put("first_name", user.getFirstName());
        params.put("last_name", user.getLastName());
        params.put("email", user.getEmail());
        params.put("birth_date", user.getBirthDate());
        params.put("subscription", user.isSubscription());

        jdbcTemplate.update(sql, params);
    }

    public void delete(final int id) {
        final String sql = "DELETE FROM users WHERE id = " + id;

        jdbcTemplate.update(sql, new HashMap<>());
    }

    public User get(final int id) {
        final String sql = "SELECT * FROM users WHERE id = " + id;

        return jdbcTemplate.queryForObject(sql, new HashMap<>(), new UserRowMapper());
    }

    public List<User> getAll() {
        final String sql = "SELECT * FROM users";

        return jdbcTemplate.query(sql, new UserRowMapper());
    }

    public void update(final User customer) {
        final String sql = "UPDATE users "
                + "SET first_name = :first_name,"
                + "last_name = :last_name,"
                + "email = :email,"
                + "birth_date = :birth_date, "
                + "subscription = :subscription "
                + "WHERE id = :id";

        final Map<String, Object> params = new HashMap<>();
        params.put("id", customer.getId());
        params.put("first_name", customer.getFirstName());
        params.put("last_name", customer.getLastName());
        params.put("email", customer.getEmail());
        params.put("birth_date", customer.getBirthDate());
        params.put("subscription", customer.isSubscription());

        jdbcTemplate.update(sql, params);
    }
}

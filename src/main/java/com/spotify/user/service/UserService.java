package com.spotify.user.service;

import com.spotify.user.repository.User;

import java.util.List;

public interface UserService {

    void addUser(User user);

    void deleteUser(int id);

    User getCustomer(int id);

    List<User> getAllUsers();

    void update(User user);
}

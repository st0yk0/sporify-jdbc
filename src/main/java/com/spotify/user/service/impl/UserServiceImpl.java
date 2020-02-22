package com.spotify.user.service.impl;

import com.spotify.user.repository.User;
import com.spotify.user.repository.UserRepository;
import com.spotify.user.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void addUser(User user) {
        userRepository.add(user);
    }

    @Override
    public void deleteUser(int id) {
        userRepository.delete(id);
    }

    @Override
    public User getCustomer(int id) {
        return userRepository.get(id);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.getAll();
    }

    @Override
    public void update(User user) {
        userRepository.update(user);
    }
}

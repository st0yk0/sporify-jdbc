package com.spotify.user.rest;

import com.spotify.user.repository.User;
import com.spotify.user.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public void addUser(User user) {
        userService.addUser(user);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(int id) {
        userService.deleteUser(id);
    }

    @GetMapping("/{id}")
    public User getCustomer(int id) {
        return userService.getCustomer(id);
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @PutMapping
    public void update(User user) {
        userService.update(user);
    }
}

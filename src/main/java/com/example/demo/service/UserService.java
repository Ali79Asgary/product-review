package com.example.demo.service;

import com.example.demo.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    User getUserById(Long id);

    User saveUser(User user);

    User updateUser(Long id, User newUser);

    void deleteUserById(Long id);
}

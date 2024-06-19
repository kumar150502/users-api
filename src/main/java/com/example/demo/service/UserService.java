package com.example.demo.service;

import com.example.demo.entity.User;

public interface UserService {

    void registerUser(User user) throws IllegalArgumentException;

    User getUserByUsername(String username);

	Iterable<User> getAllUsers();
    
}
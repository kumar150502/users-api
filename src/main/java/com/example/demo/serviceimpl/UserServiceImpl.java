package com.example.demo.serviceimpl;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void registerUser(User user) throws IllegalArgumentException {
        if (userRepository.findByUsername(user.getUsername()) != null || userRepository.findByEmail(user.getEmail()) != null) {
            throw new IllegalArgumentException("Username or email already exists");
        }

        // **WARNING: Storing plain text passwords is insecure!**
        userRepository.save(user);
    }

    @Override
    public User getUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }
}
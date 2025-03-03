package com.example.signup.service;

import com.example.signup.entity.User;
import java.util.List;

public interface UserService {
    User saveUser(User user);
    User getUserById(Long id);
    User getUserByEmail(String email);
    List<User> getAllUsers();
    void deleteUser(Long id);
}

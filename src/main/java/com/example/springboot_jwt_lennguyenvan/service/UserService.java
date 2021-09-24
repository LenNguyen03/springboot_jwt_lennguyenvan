package com.example.springboot_jwt_lennguyenvan.service;

import com.example.springboot_jwt_lennguyenvan.authentication.UserPrincipal;
import com.example.springboot_jwt_lennguyenvan.entity.User;

public interface UserService {
    User createUser(User user);
    UserPrincipal findByUsername(String username);
}

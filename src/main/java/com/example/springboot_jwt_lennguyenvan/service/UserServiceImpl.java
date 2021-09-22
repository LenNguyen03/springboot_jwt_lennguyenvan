package com.example.springboot_jwt_lennguyenvan.service;

import com.example.springboot_jwt_lennguyenvan.entity.User;
import com.example.springboot_jwt_lennguyenvan.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public User createUser(User user) {
        return userRepository.saveAndFlush(user);
    }
}

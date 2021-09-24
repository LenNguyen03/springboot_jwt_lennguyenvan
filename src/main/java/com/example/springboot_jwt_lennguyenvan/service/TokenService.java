package com.example.springboot_jwt_lennguyenvan.service;

import com.example.springboot_jwt_lennguyenvan.entity.Token;

public interface TokenService {
    Token createToken(Token token);

    Token findByToken(String token);

}

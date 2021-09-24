package com.example.springboot_jwt_lennguyenvan.service;

import com.example.springboot_jwt_lennguyenvan.entity.Token;
import com.example.springboot_jwt_lennguyenvan.repository.TokenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TokenServiceImpl implements TokenService{

    @Autowired
    private TokenRepository tokenRepository;


    @Override
    public Token createToken(Token token) {
        return tokenRepository.saveAndFlush(token);
    }

    @Override
    public Token findByToken(String token) {
        return tokenRepository.findByToken(token);
    }
}

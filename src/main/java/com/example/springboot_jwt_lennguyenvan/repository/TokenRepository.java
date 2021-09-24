package com.example.springboot_jwt_lennguyenvan.repository;


import com.example.springboot_jwt_lennguyenvan.entity.Token;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TokenRepository extends JpaRepository<Token, Long> {

    Token findByToken(String token);
}

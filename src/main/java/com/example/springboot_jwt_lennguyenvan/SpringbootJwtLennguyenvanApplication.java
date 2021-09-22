package com.example.springboot_jwt_lennguyenvan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SpringbootJwtLennguyenvanApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootJwtLennguyenvanApplication.class, args);
    }

}

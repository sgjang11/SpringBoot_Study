package com.example.boardproject;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan
public class BoardProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(BoardProjectApplication.class, args);
    }

}

package com.example.hellloword;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@MapperScan(basePackages = {"com.example.hellloword.dao"})
public class HelllowordApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelllowordApplication.class, args);
    }

    @RequestMapping
    public String hello() {
        return "hello spring boot!";
    }

}

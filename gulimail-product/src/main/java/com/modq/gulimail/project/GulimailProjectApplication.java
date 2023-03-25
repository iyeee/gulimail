package com.modq.gulimail.project;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.modq.gulimail.project.dao")
@SpringBootApplication
public class GulimailProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimailProjectApplication.class, args);
    }

}

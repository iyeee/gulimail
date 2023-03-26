package com.modq.gulimail.ware;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class GulimaiWareApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimaiWareApplication.class, args);
    }

}

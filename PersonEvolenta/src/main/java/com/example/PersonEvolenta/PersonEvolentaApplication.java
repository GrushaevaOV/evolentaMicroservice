package com.example.PersonEvolenta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PersonEvolentaApplication {

    public static void main(String[] args) {
        SpringApplication.run(PersonEvolentaApplication.class, args);
    }

}

package com.example.locationEvolenta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class LocationEvolentaApplication {

    public static void main(String[] args) {
        SpringApplication.run(LocationEvolentaApplication.class, args);
    }

}

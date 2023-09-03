package com.example.discoveryserverEvolenta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DiscoveryServerEvolentaApplication {

    public static void main(String[] args) {
        SpringApplication.run(DiscoveryServerEvolentaApplication.class, args);
    }

}

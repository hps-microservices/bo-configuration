package com.msvvdv.boconfiguration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableDiscoveryClient // enable eureka client ..
public class BoConfigurationApplication {
    public static void main(String[] args) {
        SpringApplication.run(BoConfigurationApplication.class, args);
    }
}

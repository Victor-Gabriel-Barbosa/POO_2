package com.pinboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
@ComponentScan(basePackages = "com.pinboard")
public class PinboardApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(PinboardApplication.class, args);
    }
}
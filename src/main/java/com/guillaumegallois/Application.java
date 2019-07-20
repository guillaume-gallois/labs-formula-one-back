package com.guillaumegallois;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(com.guillaumegallois.Application.class, args);
    }

    @RequestMapping("/health")
    public String health() {
        return "UP !";
    }

}

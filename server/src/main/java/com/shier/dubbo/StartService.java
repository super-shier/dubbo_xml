package com.shier.dubbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:dubble-server.xml")
public class StartService {
    public static void main(String[] args) {
        SpringApplication.run(StartService.class, args);
    }
}

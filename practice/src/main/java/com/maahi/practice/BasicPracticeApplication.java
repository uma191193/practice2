package com.maahi.practice;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Log4j2
public class BasicPracticeApplication {
    public static void main(String[] args) {
        
        SpringApplication.run(BasicPracticeApplication.class, args);
        log.info("Application started successfully");
    }
    
}

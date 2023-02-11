package com.example.learningsandboxproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication()
public class LearningSandboxProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(LearningSandboxProjectApplication.class, args);
    }

}

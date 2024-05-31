package com.example.billTracker;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BillTrackerApplication {

    public static void main(String[] args) {
        // Load environment variables from .env file
        Dotenv dotenv = Dotenv.load();

        // Set system properties for Spring Boot to use
        System.setProperty("DATABASE_HOST", dotenv.get("DATABASE_HOST"));
        System.setProperty("DATABASE_NAME", dotenv.get("DATABASE_NAME"));
        System.setProperty("DATABASE_USERNAME", dotenv.get("DATABASE_USERNAME"));
        System.setProperty("DATABASE_PASSWORD", dotenv.get("DATABASE_PASSWORD"));

        SpringApplication.run(BillTrackerApplication.class, args);
    }
}
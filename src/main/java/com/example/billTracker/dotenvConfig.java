package com.example.billTracker;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class dotenvConfig {

    @Bean
    public Dotenv dotenv() {
        return Dotenv.load();
    }
}
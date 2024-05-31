package com.example.billTracker;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class myController {

    @Autowired
    private Dotenv dotenv;

    @GetMapping("/db-info")
    public String getDatabaseInfo() {
        String dbHost = dotenv.get("DATABASE_HOST");
        String dbName = dotenv.get("DATABASE_NAME");
        return "Database Host: " + dbHost + ", Database Name: " + dbName;
    }
}

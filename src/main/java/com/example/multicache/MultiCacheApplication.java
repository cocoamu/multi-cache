package com.example.multicache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class MultiCacheApplication {

    public static void main(String[] args) {
        SpringApplication.run(MultiCacheApplication.class, args);
    }

}

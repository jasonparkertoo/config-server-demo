package com.example.service.b;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@Slf4j
@SpringBootApplication
public class ServiceBApplication implements CommandLineRunner {

    private final Environment env;

    public ServiceBApplication(Environment env) {
        this.env = env;
    }

    public static void main(String[] args) {
        SpringApplication.run(ServiceBApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("Service Greeting: {}", env.getProperty("service.greeting"));
        log.info("Common Greeting: {}", env.getProperty("common.greeting"));
        System.exit(0);
    }
}

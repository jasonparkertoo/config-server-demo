package com.example.service.a;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@Slf4j
@SpringBootApplication
public class ServiceAApplication implements CommandLineRunner {

    private final Environment env;

    public ServiceAApplication(Environment env) {
        this.env = env;
    }

    public static void main(String[] args) {
        SpringApplication.run(ServiceAApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
      log.info("Service Greeting: {}", env.getProperty("service.greeting"));
      log.info("Common Greeting: {}", env.getProperty("common.greeting"));
      System.exit(0);
    }
}

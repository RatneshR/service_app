package com.dev.serviceApp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ServiceAppApplication implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(ServiceAppApplication.class);

    public static void main(String[] args) {
		SpringApplication.run(ServiceAppApplication.class, args);
	}

    @Override
    public void run(final String... args) {
        System.out.println("Application Started!!");
    }

}

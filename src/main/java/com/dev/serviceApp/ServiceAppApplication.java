package com.dev.serviceApp;

import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@SpringBootApplication
@Log
public class ServiceAppApplication implements CommandLineRunner {

    private final DataSource dataSource;

    public ServiceAppApplication(final DataSource dataSource) {
        this.dataSource = dataSource;
        // log.info("DataSource: " + dataSource);
    }

    public static void main(String[] args) {
		SpringApplication.run(ServiceAppApplication.class, args);
	}

    @Override
    public void run(final String... args) {
        System.out.println("Application Started!!");
        // log.info("DataSource: " + dataSource.toString());

        final JdbcTemplate restTemplate = new JdbcTemplate(dataSource);
        restTemplate.execute("SELECT 1");
    }



}

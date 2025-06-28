package com.dev.serviceApp;

import com.dev.serviceApp.config.PizzaConfig;
import lombok.extern.java.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Log
public class ServiceAppApplication implements CommandLineRunner {

    private PizzaConfig pizzaConfig;

    public ServiceAppApplication(PizzaConfig pizzaConfig) {
        this.pizzaConfig = pizzaConfig;
        log.info("PizzaConfig bean initialized with values: " + pizzaConfig);
    }

    public static void main(String[] args) {
		SpringApplication.run(ServiceAppApplication.class, args);
	}

    @Override
    public void run(final String... args) {
        System.out.println("Application Started!!");

//        final PizzaConfig pizzaConfig = new PizzaConfig("tomato", "mozzarella", "thin");

        log.info(String.format("I want a %s crust pizza, with %s and %s sauce", pizzaConfig.getCrust(), pizzaConfig.getTopping(), pizzaConfig.getSauce()));
    }

}

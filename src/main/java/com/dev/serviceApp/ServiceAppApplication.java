package com.dev.serviceApp;

import com.dev.serviceApp.service.ColorPrinter;
import com.dev.serviceApp.service.ColorPrinterImplementation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ServiceAppApplication implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(ServiceAppApplication.class);

    private ColorPrinter colorPrinter;

    public ServiceAppApplication(ColorPrinter colorPrinter){
        this.colorPrinter = colorPrinter;
    }

    public static void main(String[] args) {
		SpringApplication.run(ServiceAppApplication.class, args);
	}

    @Override
    public void run(final String... args) {
//        final ColorPrinter colorPrinter = new ColorPrinterImplementation();
        log.info(colorPrinter.print());
    }

}

package com.dev.serviceApp.config;

import com.dev.serviceApp.service.*;
import com.dev.serviceApp.service.translateImplementation.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class PrinterConfig_Rename {
    @Bean
    public BluePrinter bluePrinter() {
        return new SpanishBluePrinter();
    }

    @Bean
    public RedPrinter redPrinter() {
        return new SpanishRedPrinter();
    }

    @Bean
    public GreenPrinter greenPrinter() {
        return new SpanishGreenPrinnter();
    }

    @Bean
    public ColorPrinter colorPrinter(BluePrinter bluePrinter, RedPrinter redPrinter, GreenPrinter greenPrinter) {
        return new ColorPrinterImplementation(redPrinter, bluePrinter, greenPrinter);
    }
}

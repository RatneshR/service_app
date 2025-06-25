package com.dev.serviceApp.service.translateImplementation;

import com.dev.serviceApp.service.GreenPrinter;
import org.springframework.stereotype.Component;

@Component
public class SpanishGreenPrinnter implements GreenPrinter {
    @Override
    public String print() {
        return "verde";
    }
}

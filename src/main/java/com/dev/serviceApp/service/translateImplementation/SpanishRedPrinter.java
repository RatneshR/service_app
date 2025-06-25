package com.dev.serviceApp.service.translateImplementation;

import com.dev.serviceApp.service.RedPrinter;
import org.springframework.stereotype.Component;

//@Component
public class SpanishRedPrinter implements RedPrinter {
    @Override
    public String print() {
        return "rojo";
    }
}

package com.dev.serviceApp.service.translateImplementation;

import com.dev.serviceApp.service.BluePrinter;
import org.springframework.stereotype.Component;

//@Component
public class SpanishBluePrinter implements BluePrinter {

    @Override
    public String print() {
        return "azul";
    }
}

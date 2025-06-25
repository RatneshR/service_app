package com.dev.serviceApp.service;

import com.dev.serviceApp.service.translateImplementation.EngBluePrinter;
import com.dev.serviceApp.service.translateImplementation.EngGreenPrinter;
import com.dev.serviceApp.service.translateImplementation.EngRedPrinter;
import org.springframework.stereotype.Component;

@Component
public class ColorPrinterImplementation implements ColorPrinter {
    private RedPrinter redPriniter;
    private BluePrinter bluePrinter;
    private GreenPrinter greenPrinter;

    public ColorPrinterImplementation(RedPrinter redPrinter, BluePrinter bluePrinter, GreenPrinter greenPrinter){
//        this.redPriniter = new EngRedPrinter();
//        this.bluePrinter = new EngBluePrinter();
//        this.greenPrinter = new EngGreenPrinter();
        this.redPriniter = redPrinter;
        this.bluePrinter = bluePrinter;
        this.greenPrinter = greenPrinter;
    }

    @Override
    public String print() {
        return String.join(", ", redPriniter.print(), bluePrinter.print(), greenPrinter.print());
    }
}

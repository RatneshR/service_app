package com.dev.serviceApp.service.translateImplementation;

import com.dev.serviceApp.service.ColorPrinter;

public class ColorPrinterImplementation implements ColorPrinter {
    private RedPrinter redPriniter;
    private BluePrinter bluePrinter;
    private GreenPrinter greenPrinter;

    public ColorPrinterImplementation(){
        this.redPriniter = new RedPrinter();
        this.bluePrinter = new BluePrinter();
        this.greenPrinter = new GreenPrinter();
    }

    @Override
    public String print() {
        return String.join(", ", redPriniter.print(), bluePrinter.print(), greenPrinter.print());
    }
}

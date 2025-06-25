package com.dev.serviceApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationController {

    @GetMapping(path = "/hello")
    public String helloWorld(){
        return "Hello Ratnesh!";
    }
}

package com.esi.labs;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class testRestApi {
    @GetMapping("/esi")
    public String helloWorld() {
        return "Welcome to the ESI course!";
    }
}
package com.bank.poc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/api/poc")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}

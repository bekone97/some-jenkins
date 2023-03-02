package com.example.somejenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class SomeController {
    @GetMapping
    public String getHello(){
        return "Hello";
    }
}

package com.baburam.javatodo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HellioController {

    @GetMapping("/greet")
    public String greet(){
        return "hello sisir";
    }
}

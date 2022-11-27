package com.i7i8i9.musicbird1.controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/hello")
@CrossOrigin
public class DefaultController {
    @GetMapping
    public String sayHello(){
        return  "welcome i7i8i9";
    }
}

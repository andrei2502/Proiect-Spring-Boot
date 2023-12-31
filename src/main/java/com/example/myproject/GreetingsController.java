package com.example.myproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping(path = "/api/v1/greetings")
public class GreetingsController {
    @GetMapping(path = "/hello")
    public String hello(){
        return "Salut!";
    }

    @GetMapping(path = "/goodbye")
    public String goodbye(){
        return "La revedere";
    }
}

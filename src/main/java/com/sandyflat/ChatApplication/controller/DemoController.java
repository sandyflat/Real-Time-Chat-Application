package com.sandyflat.ChatApplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class DemoController {

    @GetMapping
    public String appStatus(){
        return "App is running..";
    }
}

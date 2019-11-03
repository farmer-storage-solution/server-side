package com.storage.solutions.StorageSolution.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

@RestController
        @RequestMapping("/status")
public class Status {

    @GetMapping
    public String status(){
        return "Hello World";
    }
}

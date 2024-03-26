package com.bejreh.booking.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {
    
    @GetMapping("/ping")
    public String ping() {
        return "success ping";
    }
}

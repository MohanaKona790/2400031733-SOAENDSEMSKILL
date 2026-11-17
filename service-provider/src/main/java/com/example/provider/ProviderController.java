package com.example.provider;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController {
    @GetMapping("/message")
    public String getMessage() {
        return "Hello from Service Provider!";
    }
}

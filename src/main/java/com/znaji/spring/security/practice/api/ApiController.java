package com.znaji.spring.security.practice.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {

    @GetMapping("/public")
    public String publicEndpoint() {
        return "Public content";
    }

    @GetMapping("/user")
    public String userEndpoint() {
        return "User content";
    }

    @GetMapping("/admin")
    public String adminEndpoint() {
        return "Admin content";
    }
}

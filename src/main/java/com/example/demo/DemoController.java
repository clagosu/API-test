package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class DemoController {

    @GetMapping("/hello")
    public String hello(@RequestParam String name) {
        return "Hello " + name;
    }

    @PostMapping("/echo")
    public String echo(@RequestBody String input) {
        return "Received: " + input;
    }
}
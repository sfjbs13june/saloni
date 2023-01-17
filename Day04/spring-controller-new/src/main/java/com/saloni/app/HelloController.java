package com.saloni.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class HelloController {

    @GetMapping("/hello")
    public String SayHello() {
        return "Hello From App";
    }

    @RequestMapping("/request/hello")
    public String requestHello() {
        return "Hello From Request Mapping";
    }

    @GetMapping("/welcome1")
    public String welcome1(@RequestParam("name") String name) {
        return "Welcome to " + name;
    }

    @GetMapping("/send/{message}")
    public String sendMessage(@PathVariable String message) {
        return "send message " + message;
    }
}
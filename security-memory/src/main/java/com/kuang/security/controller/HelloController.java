package com.kuang.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/admin/hello")
    public String admin() {
        return "admin hello";
    }

    @GetMapping("/user/hello")
    public String user() {
        return "user hello";
    }

    @GetMapping("/db/hello")
    public String db() {
        return "db hello";
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
}

package com.kuang.security.controller;

import com.kuang.security.service.MethodService;
import org.springframework.beans.factory.annotation.Autowired;
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

//    @GetMapping("/hello")
//    public String hello() {
//        return "hello";
//    }

    @Autowired
    MethodService methodService;

    @GetMapping("/hello")
    public String hello() {
        String user = methodService.user();
        return user;
    }

    @GetMapping("/hello2")
    public String hello2() {
        String admin = methodService.admin();
        return admin;
    }

    @GetMapping("/hello3")
    public String hello3() {
        String dba = methodService.dba();
        return dba;
    }
}

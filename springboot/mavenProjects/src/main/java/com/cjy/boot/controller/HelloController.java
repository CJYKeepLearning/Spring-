package com.cjy.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloController {
    @RequestMapping("/hhh")
    public String handle01(){
        return "hello,Spring Boot 2";
    }
}

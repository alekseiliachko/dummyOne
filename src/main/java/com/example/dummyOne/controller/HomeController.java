package com.example.dummyOne.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public ResponseEntity<String> index() {
        return ResponseEntity.ok("hello world");
    }
}
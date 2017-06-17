package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BoardController {

    @RequestMapping("/")
    public String main() {

        return "this is board main!!!";
    }
}

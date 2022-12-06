package com.nest.courseapp_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

    @GetMapping("/")
    public String homepage(){
        return "WELCOME TO MY HOMEPAGE";
    }
    @PostMapping("/add")
    public String add(){
        return "COURSE ADDED SUCCESSFULLY";
    }

    @GetMapping("/view")
    public String view(){
        return "THIS IS MY VIEW COURSE PAGE";
    }

}

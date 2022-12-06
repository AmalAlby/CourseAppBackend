package com.nest.courseapp_backend.controller;

import com.nest.courseapp_backend.model.Course;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

    @GetMapping("/")
    public String homepage(){
        return "WELCOME TO MY HOMEPAGE";
    }
    @PostMapping(path="/add",consumes ="application/json" ,produces = "application/json")
    public String add(@RequestBody Course c){
        System.out.println("Course Title = "+c.getCourseTitle().toString());
        System.out.println("Course  Description = "+c.getCourseDesc().toString());
        System.out.println("Course Venue = "+c.getVenue().toString());
        System.out.println("Course Duration = "+c.getDuration().toString());
        System.out.println("Course Date = "+c.getDate().toString());
        return "COURSE ADDED SUCCESSFULLY";
    }

    @GetMapping("/view")
    public String view(){
        return "THIS IS MY VIEW COURSE PAGE";
    }

}

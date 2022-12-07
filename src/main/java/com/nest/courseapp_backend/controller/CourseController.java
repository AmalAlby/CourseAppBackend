package com.nest.courseapp_backend.controller;

import com.nest.courseapp_backend.dao.CourseDao;
import com.nest.courseapp_backend.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class CourseController {

    @Autowired
    private CourseDao dao;

    @CrossOrigin(origins = "*")
    @GetMapping("/")
    public String Home(){
        return "WELCOME TO HOMEPAGE";
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/search",consumes ="application/json",produces ="application/json")
    public List<Course> Search_course(@RequestBody Course c){
        String c_title=c.getCourseTitle().toString();
        System.out.println(c_title);
        return (List<Course>) dao.SearchCourse(c.getCourseTitle());
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path="/add",consumes ="application/json" ,produces = "application/json")
    public Map<String,String> add(@RequestBody Course c){
        System.out.println("Course Title = "+c.getCourseTitle().toString());
        System.out.println("Course  Description = "+c.getCourseDesc().toString());
        System.out.println("Course Venue = "+c.getVenue().toString());
        System.out.println("Course Duration = "+c.getDuration().toString());
        System.out.println("Course Date = "+c.getDate().toString());
        dao.save(c);
        HashMap<String,String> map=new HashMap<>();
        map.put("status","success");
        return map;
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/view")
    public List<Course> view(){

        return (List<Course>) dao.findAll() ;
    }

}

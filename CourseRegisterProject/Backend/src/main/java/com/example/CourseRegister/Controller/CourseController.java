package com.example.CourseRegister.Controller;

import com.example.CourseRegister.Model.Course;
import com.example.CourseRegister.Model.CourseRegistry;
import com.example.CourseRegister.Service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins ="*")
public class CourseController {

    @Autowired
    CourseService courseService;
    @GetMapping("/allcourse")
    public List<Course> AvailableCourse()
    {
        return courseService.getAllCourses();
    }

    @GetMapping("/allcourse/entrolled")
    public List<CourseRegistry> entrolled(){
        return courseService.entrolled();


    }
    @PostMapping("/allcourse/register")
    public String register(@RequestParam("name")String name,
                            @RequestParam("emailId")String emailid,
                             @RequestParam("courseName")String courseName){
      courseService.entroll(name,emailid,courseName);
      return "Congratulation "+name+" your Course"+courseName+"Register Succesfully";

    }


    }



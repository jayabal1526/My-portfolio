package com.example.CourseRegister.Service;

import com.example.CourseRegister.Model.Course;
import com.example.CourseRegister.Model.CourseRegistry;
import com.example.CourseRegister.Repository.CourseRegistryRepo;
import com.example.CourseRegister.Repository.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CourseService {

@Autowired
CourseRepo courseRepo;
    public List<Course> getAllCourses() {
        return  courseRepo.findAll();
    }

    @Autowired
    CourseRegistryRepo courseRegistryRepo;
    public List<CourseRegistry> entrolled() {
       return courseRegistryRepo.findAll();
    }

    public void entroll(String name, String emailid, String courseName) {
        CourseRegistry courseRegistry=new CourseRegistry(name,emailid,courseName);
        courseRegistryRepo.save(courseRegistry);


    }
}

package com.example.CourseRegister.Repository;

import com.example.CourseRegister.Model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepo extends JpaRepository<Course,String>{

}

package com.example.CourseRegister.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@AllArgsConstructor
@Entity
@Getter
@Setter
public class CourseRegistry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;//no need to provide value
    private  String name;
    private String emailId;
    private String courseName;


    public CourseRegistry(String name, String emailId, String courseName) {
        this.name=name;
        this.emailId=emailId;
        this.courseName=courseName;
    }

    public CourseRegistry() {
    }
}

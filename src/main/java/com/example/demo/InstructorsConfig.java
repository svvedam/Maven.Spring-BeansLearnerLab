package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class InstructorsConfig {


    @Bean(name="tcUsa")
    public Instructors tcUsaInstructors(){
        List<Instructor> usInstructorsList = new ArrayList<>();

        Instructor usInstructor1 = new Instructor(3000,"leon");
        Instructor usInstructor2 = new Instructor(4000,"wil");

        usInstructorsList.add(usInstructor1);
        usInstructorsList.add(usInstructor2);
        return new Instructors(usInstructorsList);
    }


    @Bean(name="tcUK")
    public Instructors tcUkInstructors(){
        List<Instructor> ukInstructorsList = new ArrayList<>();

        Instructor ukInstructor1 = new Instructor(5000,"nhu");
        Instructor ukInstructor2 = new Instructor(6000,"kris");

        ukInstructorsList.add(ukInstructor1);
        ukInstructorsList.add(ukInstructor2);
        return new Instructors(ukInstructorsList);
    }

    @Primary
    @Bean(name="instructors")
    public Instructors allZipCodeInstructors(){
        List<Instructor> masterList = new ArrayList<>();

        masterList.addAll(tcUkInstructors().findAll());
        masterList.addAll(tcUsaInstructors().findAll());

        return new Instructors(masterList);

    }

}

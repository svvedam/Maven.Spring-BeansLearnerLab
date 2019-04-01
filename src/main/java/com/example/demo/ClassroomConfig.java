package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
@Configuration
public class ClassroomConfig {
    @Autowired
    StudentConfig studentConfig;

    @Autowired
    InstructorsConfig instructorsConfig;

    @Bean(name="currentCohort")
    //@DependsOn({"instructors", "students"})
    public Classroom currentCohort(){

        Classroom classroom = new Classroom(instructorsConfig.allZipCodeInstructors(), studentConfig.currentStudents());

        return classroom;
    }

    @Bean(name="previousCohort")
    //@DependsOn({"instructors", "previousStudents"})
    public Classroom previousCohort(Instructors instructors, Students previousStudents){

        Classroom classroom = new Classroom(instructorsConfig.allZipCodeInstructors(), studentConfig.previousStudents());

        return classroom;
    }

}

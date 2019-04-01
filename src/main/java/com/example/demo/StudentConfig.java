package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean(name = "students")
    public Students currentStudents(){
        List<Student> studentList = new ArrayList<>();
        Student student1 = new Student(1000,"sravani",20);
        Student student2 = new Student(2000,"priya",30);

        studentList.add(student1);
        studentList.add(student2);
        Students students = new Students(studentList);
        return students;
    }

    @Bean(name = "previousStudents")
    public Students previousStudents(){
        List<Student> studentList = new ArrayList<>();
        Student student1 = new Student(3000,"kim",20);
        Student student2 = new Student(4000,"sharma",30);

        studentList.add(student1);
        studentList.add(student2);
        Students students = new Students(studentList);
        return students;
    }
}

package com.example.demo;

import org.springframework.stereotype.Component;

import java.util.Iterator;
import java.util.List;

public class Instructors extends People<Instructor> {
    Instructors(List<Instructor> instructorsList){
        for(Instructor instructor:instructorsList) {
            personList.add(instructor);
        }
    }


}

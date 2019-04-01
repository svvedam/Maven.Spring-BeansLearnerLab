package com.example.demo;

import java.util.Iterator;
import java.util.List;

public class Students extends People<Student> {
    Students(List<Student> students){
       for(Student student:students) {
           personList.add(student);
       }
    }


}

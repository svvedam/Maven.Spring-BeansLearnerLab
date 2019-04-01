package com.example.demo;

import java.util.ArrayList;
import java.util.Collection;

public class Classroom {

    Instructors instructors;
    Students students;
    Classroom(){

    }

    public Classroom(Instructors instructors, Students students) {
        this.instructors = instructors;
        this.students= students;
    }

    public void hostLecture(Teacher teacher, double numberOfHours) {

        teacher.lecture(students, numberOfHours);
    }
}

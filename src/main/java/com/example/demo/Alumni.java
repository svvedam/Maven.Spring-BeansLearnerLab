package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Alumni {
    @Autowired
    Classroom previousCohort;

    @PostConstruct
    public void executeBootCamp(){
        //teaches each Student in the composite Students a totalNumberOfHours of 1200
       Double studentSize = Double.valueOf(previousCohort.students.personList.size());
       Double instructorSize=Double.valueOf(previousCohort.instructors.personList.size());
       Double individualHours = 1200/studentSize;
       for(Student student: previousCohort.students){
           student.setTotalStudyTime(individualHours);
       }

       Double numberOfHoursToTeach= 1200*studentSize;
       Double numberOfHoursPerInstructor = numberOfHoursToTeach/instructorSize;

       for(Instructor instructor:previousCohort.instructors){
            instructor.numberOfHoursPerInstructor=numberOfHoursPerInstructor;
       }
    }
}

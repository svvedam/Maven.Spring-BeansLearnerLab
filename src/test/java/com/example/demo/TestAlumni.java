package com.example.demo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class TestAlumni {

    @Autowired
    Alumni alumni;

    @Test
    public void alumniHoursTest(){
        //Given

        //When
        Double actualStudentHours1 = alumni.previousCohort.students.personList.get(0).getTotalStudyTime();
        Double expectedStudentHours1=600.0;

        Double actualInstructorHours1 = alumni.previousCohort.instructors.personList.get(0).getNumberOfHoursPerInstructor();
        Double expectedInstructorHours1=600.0;


        //Then
        Assert.assertEquals(expectedStudentHours1,actualStudentHours1);
        Assert.assertEquals(expectedInstructorHours1,actualInstructorHours1);


    }

}

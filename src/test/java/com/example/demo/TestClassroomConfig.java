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
public class TestClassroomConfig {

    @Autowired
    @Qualifier("currentCohort")
    Classroom currentCohort;

    @Autowired
    @Qualifier("previousCohort")
    Classroom previousCohort;

    @Test
    public void verifyCurrentCohortTest(){
        //Given

        //When
        Long expectedStudentId1 =currentCohort.students.personList.get(0).getId();
        Long actualStudentId1=1000l;
        Long expectedInstructorId1 =currentCohort.instructors.personList.get(0).getId();
        Long actualInstructorId1=5000l;

        //Then
        Assert.assertEquals(expectedStudentId1,actualStudentId1);
        Assert.assertEquals(expectedInstructorId1,actualInstructorId1);
    }

    @Test
    public void verifyPreviousCohortTest(){
        //Given

        //When
        Long expectedStudentId1 =previousCohort.students.personList.get(0).getId();
        Long actualStudentId1=3000l;
        Long expectedInstructorId1 =previousCohort.instructors.personList.get(0).getId();
        Long actualInstructorId1=5000l;

        //Then
        Assert.assertEquals(expectedStudentId1,actualStudentId1);
        Assert.assertEquals(expectedInstructorId1,actualInstructorId1);
    }
}

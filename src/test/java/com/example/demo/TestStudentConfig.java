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
public class TestStudentConfig {

    @Autowired
    @Qualifier("students")
    Students students;

    @Test
    public void getStudentsTest(){
        //Given

        //When
        Long expectedId1 =students.personList.get(0).getId();
        Long expectedId2 =students.personList.get(1).getId();
        Long actualId1=1000l;
        Long actualId2=2000l;

        //Then
        Assert.assertEquals(expectedId1,actualId1);
        Assert.assertEquals(expectedId2,actualId2);
    }
}

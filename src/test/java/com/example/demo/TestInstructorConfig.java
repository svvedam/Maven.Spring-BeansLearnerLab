package com.example.demo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class TestInstructorConfig {

    @Autowired
    @Qualifier("tcUsa")
    Instructors usInstructors;

    @Autowired
    @Qualifier("tcUK")
    Instructors ukInstructors;

    @Autowired
    @Qualifier("instructors")
    Instructors instructors;


    @Test
    public void usInstructorsTest(){
        //Given

        //When
        Long actualId1 = usInstructors.personList.get(0).getId();
        Long expectedId1=3000l;
        String actualName1= usInstructors.personList.get(0).getName();
        String expectedName1 = "leon";

        Long actualId2 = usInstructors.personList.get(1).getId();
        Long expectedId2=4000l;
        String actualName2= usInstructors.personList.get(1).getName();
        String expectedName2 = "wil";


        //Then
        Assert.assertEquals(expectedId1,actualId1);
        Assert.assertEquals(expectedName1,actualName1);
        Assert.assertEquals(expectedId2,actualId2);
        Assert.assertEquals(expectedName2,actualName2);

    }
    @Test
    public void ukInstructorsTest(){
        //Given

        //When
        Long actualId1 = ukInstructors.personList.get(0).getId();
        Long expectedId1=5000l;
        String actualName1= ukInstructors.personList.get(0).getName();
        String expectedName1 = "nhu";

        Long actualId2 = ukInstructors.personList.get(1).getId();
        Long expectedId2=6000l;
        String actualName2= ukInstructors.personList.get(1).getName();
        String expectedName2 = "kris";


        //Then
        Assert.assertEquals(expectedId1,actualId1);
        Assert.assertEquals(expectedName1,actualName1);
        Assert.assertEquals(expectedId2,actualId2);
        Assert.assertEquals(expectedName2,actualName2);

    }
    @Test
    public void allZipCodeInstructorsTest(){
        //Given

        //When
        Long actualId1 = instructors.personList.get(0).getId();
        Long expectedId1=5000l;
        String actualName1= instructors.personList.get(0).getName();
        String expectedName1 = "nhu";

        Long actualId2 = instructors.personList.get(2).getId();
        Long expectedId2=3000l;
        String actualName2= instructors.personList.get(2).getName();
        String expectedName2 = "leon";


        //Then
        Assert.assertEquals(expectedId1,actualId1);
        Assert.assertEquals(expectedName1,actualName1);
        Assert.assertEquals(expectedId2,actualId2);
        Assert.assertEquals(expectedName2,actualName2);
    }
}

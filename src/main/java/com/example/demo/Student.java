package com.example.demo;

public class Student extends Person<Student> implements LearnerInterface {


    private double totalStudyTime;

    public void setTotalStudyTime(double totalStudyTime) {
        this.totalStudyTime = totalStudyTime;
    }


    public Student(long id, String name, double totalStudyTime) {
        super(id, name);
        this.totalStudyTime = totalStudyTime;
    }


    public double getTotalStudyTime() {

        return totalStudyTime;
    }

    @Override
    public void learn(double numberOfHours){

    }
}

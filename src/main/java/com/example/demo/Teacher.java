package com.example.demo;

public interface Teacher {
    public void teach(LearnerInterface learnerInterface, double numberOfHours);
    public void lecture(Iterable<? extends LearnerInterface> learners, double numberOfHours);
}

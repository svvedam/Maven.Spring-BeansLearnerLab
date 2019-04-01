package com.example.demo;

import java.util.Collection;
import java.util.Collections;

public class Instructor extends Person implements Teacher{

    double numberOfHoursPerInstructor=0.0;
    public Instructor(long id, String name) {
        super(id,name);
    }

    public void teach(LearnerInterface learner, double numberOfHours) {
        //Instructor should have a concrete implementation of the teach
        // method which invokes the learn method on the specified Learner object.
        learner.learn(numberOfHours);
    }

    public void lecture(Iterable<? extends LearnerInterface> learners, double numberOfHours) {
        int length=0;
        if(learners instanceof Collection){
            length = ((Collection<?>)learners).size();
        }
        
        double numberOfHoursPerLearner = numberOfHours / length;
        for(LearnerInterface learner: learners){
            learner.learn(numberOfHoursPerLearner);
        }
    }
    public void setNumberOfHoursPerInstructor(double noOfHoursPerInstructor){
        numberOfHoursPerInstructor = noOfHoursPerInstructor;
    }
    public double getNumberOfHoursPerInstructor() {
        return numberOfHoursPerInstructor;
    }

}

// double numberOfHoursLearnerInterface[] learners
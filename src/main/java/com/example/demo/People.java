package com.example.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class People<T extends Person> implements Iterable<T>{
    ArrayList<T> personList;
    People(){

        personList = new ArrayList<T>();
    }

    public void add(T person){

        personList.add(person);
    }
    public void remove(T person) {

        personList.remove(person);
    }

    public Integer size(){

        return personList.size();
    }

    public void clear(){

        personList.clear();
    }

    public void addAll(Iterable<? extends Person> persons){

        for(Person person: persons){
            personList.add((T) person);
        }

    }

    public T findById(Long id){
        Person returnedPerson = null;
        for(Person person: personList){
            if(person.getId()==id)
                returnedPerson = person;
        }
        return (T) returnedPerson;
    }

    public List<T> findAll(){

        return personList;
    }

    @Override
    public String toString() {
        return "People{" +
                "personList=" + personList +
                '}';
    }

    @Override
    public Iterator<T> iterator() {
        return personList.iterator();
    }

//    public  T[] getArray(){
//
//        T[] returnArray =  (T[]) personList.toArray(new Person[0]);
//
//        return returnArray;
//    }
//    private static final People peopleinstance = new People(){};
//
//    public static People getPeopleinstanceInstance(){
//        return peopleinstance;
//    }
}

package org.example.superclass;

import org.example.interfaces.*;

public class Person implements Actions{

    //attributes
    public int id;
    private String name;
    private String address;

    //constructor has no return type!!!
    public Person(int id, String name, String address){
        this.id = id;
        this.name = name;
        this.address = address;
    }

    //methods (A function in a class called method)
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public String getAddress(){
        return this.address;
    }

    public void printMyName(){
        System.out.println("My name is " + this.name);
    }

    @Override
    public void goToSomewhere(String location) {
        System.out.println("I go to " + location);
    }

    @Override
    public void sleep() {
        System.out.println("I am going to sleep now.");
    }
}


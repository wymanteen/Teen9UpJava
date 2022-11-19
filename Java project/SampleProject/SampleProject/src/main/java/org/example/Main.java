package org.example;

import org.example.superclass.Person;
import org.example.superclass.subclass.Staff;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        //Create a Person obj
        Person p1 = new Person(0, "John", "UK");
        p1.printMyName();

        //Create a Staff obj
        Staff s1 = new Staff(1, "Amy", "HK", 1500.5f);      //f = float data type
        s1.printMyName();


        //Call implemented methods
        p1.goToSomewhere("school");
        s1.goToSomewhere("office");
    }
}
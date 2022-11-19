package org.example;

import org.example.model.Person;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        //Create a Person obj
        Person p1 = new Person(0, "John", "UK");
        p1.printMyName();
    }
}
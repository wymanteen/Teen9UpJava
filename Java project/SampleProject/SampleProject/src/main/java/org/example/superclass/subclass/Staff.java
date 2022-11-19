package org.example.superclass.subclass;

import org.example.superclass.Person;

public class Staff extends Person {

    private float salary;

    //constructor
    public Staff(int id, String name, String address, float salary) {
        super(id, name, address);       //need to call super() first
        this.salary = salary;
    }

    //methods
    public void setSalary(float salary){
        this.salary = salary;
    }

    public float getSalary(){
        return getSalary();
    }

    //override superclass printMyName Method
    @Override
    public void printMyName() {
        System.out.println("My name is " + this.getName() + " and my salary is " + this.salary + " pcm.");
    }
}

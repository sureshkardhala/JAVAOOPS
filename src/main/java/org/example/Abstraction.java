package org.example;

abstract class Student{
    public abstract void name();
    public void getMessage(){
        System.out.println("Inside abstact method");
    }
}

class School extends Student{
    @Override
    public void name() {
        System.out.println("Name is suresh");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        School sch = new School();
        sch.getMessage();
        sch.name();
    }
}

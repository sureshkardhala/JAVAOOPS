package org.example;

//Bundle the data and code wroking with data
//Can be achieved by declering data memebers as private and create public getters and setters to modify and view data
public class Encapsulation {
    private int salary;
    private String name;

    public Encapsulation(int salary, String name){
        this.name=name;
        this.salary=salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
class  Test{
    public static void main(String[] args) {
        Encapsulation ec = new Encapsulation(12000, "Suresh");
        System.out.println("Name : " + ec.getName());
        System.out.println("Salary : " + ec.getSalary());
    }
}
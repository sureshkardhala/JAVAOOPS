package org.example;


//Class is a blue print to create a object
//Object is instance of class. which have state or property and behaviour
//Here Age, course are the state or properties of a object
//GetDetails is the behaviour or function of object
class Stduent {
    int age;
    String course;
    int marks;
    String name;

    //Constructor
    public Stduent(int age, int marks, String course, String name){
        this.age=age;
        this.course=course;
        this.marks=marks;
        this.name=name;
    }

    //Getters

    public int getAge(){
        return this.age;
    }

    public int getMarks(){
        return this.marks;
    }

    public String getCourse(){
        return  this.course;
    }

    public String getName(){
        return  this.name;
    }

    //Setters
    public void setAge(int age){
        this.age=age;
    }

    public void  setCourse(String course){
        this.course=course;
    }

    public void  setName(String name){
        this.name=name;
    }

    public void setMarks(int marks){
        this.marks=marks;
    }

    public void getDetails(){
        System.out.println("Name : " + this.name);
        System.out.println("Course : " + this.course);
        System.out.println("Marks : " + this.marks);
        System.out.println("Age : " + this.age);

    }
}
public class ClassandObject{
    public static void main(String[] args) {
        Stduent doctorStudent = new Stduent(18, 500,"MBBS", "Suresh");
        Stduent engineerStudent = new Stduent(18, 500,"BTECH", "Rishika");
        doctorStudent.getDetails();
        System.out.println();
        doctorStudent.setAge(40);
        System.out.println();
        doctorStudent.getDetails();
        System.out.println();
        engineerStudent.getDetails();
    }
}
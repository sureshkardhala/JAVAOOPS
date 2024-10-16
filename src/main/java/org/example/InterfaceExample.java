package org.example;


//Variable by default static and final
public interface InterfaceExample {
   int age = 0;
   void message();
   static void setMessage(){
       System.out.println("Inside interface");
   }
}

abstract class A implements InterfaceExample{
    @Override
    public void message(){
        System.out.println("Implemented inside a child class");
    }

    public abstract void getMeesage();
}

class BA extends A{

    @Override
    public void getMeesage() {
        System.out.println("from child BA");
    }
}

class TestExample{
    public static void main(String[] args) {
        BA a = new BA();
        a.message();
        System.out.println(InterfaceExample.age);
        InterfaceExample.setMessage();
    }
}

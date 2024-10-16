package org.example;

class Alpha {
    int age =20;
    public void hello(){
        System.out.println("hello from super class alpha");
    }
    public Alpha(){
        System.out.println("Constructor Alpha");
    }
}

class Beta extends Alpha{
    public Beta(){
        super();
        System.out.println("Constructor from Beta");
        System.out.println("Age from Alpha" + super.age);
    }
    public void helloB(){
        System.out.println("Hello from B");
        super.hello();
    }
}
public class Super{
    public static void main(String[] args) {
        Beta b = new Beta();
        b.helloB();
    }
}
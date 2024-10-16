package org.example;

interface AB{
    void getMessage();
}

interface B{
    int marks =300;
    void getMessage();
    void getRank();
}

class  C implements AB,B{

    @Override
    public void getMessage() {
        System.out.println("from child");
    }

    @Override
    public void getRank() {
        System.out.println("Rank is : " + 1);
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        C c = new C();
        c.getRank();
        c.getMessage();
        System.out.println(B.marks);
    }
}

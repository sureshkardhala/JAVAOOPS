package org.example;

class Vehicle {
    boolean hasEnginee;
    public boolean getEnginee(){
        return this.hasEnginee;
    }
    public void setHasEnginee(boolean hasEnginee){
        this.hasEnginee = hasEnginee;
    }
}

class Car extends Vehicle {
    int cc;

    public int getCc(){
       return this.cc;
    }
    public void setCc(int cc){
        this.cc=cc;
    }
}

public  class Inheritance {
    public static void main(String[] args) {
        Car car =  new Car();
        System.out.println(car.hasEnginee);
        car.setHasEnginee(true);
        System.out.println(car.hasEnginee);
        car.setCc(1000);
        System.out.println("CAR CC : " + car.getCc());
    }
}
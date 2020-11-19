package com.syntax.class27;
public abstract class Vehicle {

    String color;
    static int totalVehicle;
 /*   Vehicle(){
        totalVehicle++;
        System.out.println("I will be called when ever an object of my Child" +
                "class will be created using no argument constructor");
    }*/
    Vehicle(String color){
        totalVehicle++;
        this.color=color;
        System.out.println("I will be called when ever an object of my Child" +
                "class will be created using one argument constructor");
    }

    public void drive(){
        System.out.println(" Vehicle drives");
    }

    public void stop(){
        System.out.println("Vehicle stops");
    }
    public abstract  void start();
    public abstract  void brake();
}
//can have only one public class in a file
abstract class Car extends Vehicle{
    String carType;
    Car(String color,String carType){
        super(color);
        this.carType=carType;


    }
    @Override
    public void brake() {
        System.out.println(carType+ " have brakes");
    }
}

class Tesla extends Car{

    String make;
    Tesla(String color, String carType,String make) {
        super(color, carType);
        this.make=make;
    }

    @Override
    public void start() {
        System.out.println(make +"Can start remotely");
    }

    @Override
    public void drive() {
        System.out.println(" Can drive on autopilot");
    }

    public void display(){
        System.out.println(" Color of card "+color+" Card Type "+carType+" make "+make);
    }

}

class toyota extends Car{

    String make;
    toyota(String color, String carType,String make) {
        super(color, carType);
        this.make=make;
    }

    @Override
    public void start() {
        System.out.println(make+ " can start without keys");
    }
}

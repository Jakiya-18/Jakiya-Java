package com.tutorsdude.accessspecifier;

public class Vehicle {

    public String name;
    public String brand;
    public int price;
    public int wheels;

    public static void move(){
        System.out.println("Car is moving....");
    }
    private static void stopCar(){
        System.out.println("Car stopped...");
    }
    protected static void transport(){
        System.out.println("Transporting People...");
    }
    static void startcar(){
        System.out.println("Car started...");
    }

    public static void main(String[] args) {
        move();
        stopCar();
        transport();
        startcar();
    }
}

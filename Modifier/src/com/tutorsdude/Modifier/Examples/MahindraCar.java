package com.tutorsdude.Modifier.Examples;

public class MahindraCar {
    public static String carName;
    public static String brandName;
    public int price;
    public String color;
    public static String factoryLocation;
    public String modelName;

    public void moving(){
        System.out.println("Car is moving.....");
    }

    public static void carStopped(){
        System.out.println("Car has stopped....");
    }

    public void printAll(){
        System.out.println("Car name : " + carName);
        System.out.println("car's brand name : " + brandName);
        System.out.println("Price : " + price);
        System.out.println("Color : " + color);
        System.out.println("Factory Location : " + factoryLocation);
        System.out.println("Model Name : " + modelName);
    }


}

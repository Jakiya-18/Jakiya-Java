package com.tutorsdude.overriding.Ex;

public class Traingle extends Shape{

    public void draw() {
        System.out.println("Drawing a Traingle....!!");
    }

    public double area(int b, int h){
        double i = 0.5*b*h;
        return i;
    }
}

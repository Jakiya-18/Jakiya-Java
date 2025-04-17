package com.tutorsdude.overriding.Ex;

public class Circle extends Shape{
    public void draw(){
        System.out.println("Drawing a circle...!");
    }

    public double area(double pie, int r){
        double i = pie * r * r;
        return  i;
    }
}

package com.tutorsdude.overriding;

import com.tutorsdude.overriding.Ex.Circle;
import com.tutorsdude.overriding.Ex.Shape;
import com.tutorsdude.overriding.Ex.Traingle;

public class OverridingRunner {
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.draw();
        shape.area();

        System.out.println("****************************");
        Circle circle= new Circle();
        circle.draw();

        double result = circle.area(3.142, 4);
        System.out.println("Area of Circle is : " + result);

        System.out.println("****************************");
        Traingle traingle = new Traingle();
        traingle.draw();

        double result1 = traingle.area(5,5);
        System.out.println("Area of traingle is : " + result1);

    }
}

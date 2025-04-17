package com.tutorsdude.Interface;

import com.tutorsdude.Interface.Example.Circle;
import com.tutorsdude.Interface.Example.Dog;
import com.tutorsdude.Interface.Example.Kitchen;
import com.tutorsdude.Interface.Example.Phone;

public class InterfaceRunner {
    public static void main(String[] args) {

        System.out.println("--------DOG CLASS---------");
        Dog dog = new Dog();
        dog.makeSound();
        dog.move();

        System.out.println("----------PHONE CLASS-------");
        Phone phone = new Phone();
        phone.makeCall();
        phone.playSong();

        System.out.println("----------CIRCLE---------");
        Circle circle = new Circle();
        circle.areaOfCircle();

        System.out.println("----------KITCHEN---------");
        Kitchen kitchen = new Kitchen();
        kitchen.cooking();
        kitchen.deliciousFood();
    }

}

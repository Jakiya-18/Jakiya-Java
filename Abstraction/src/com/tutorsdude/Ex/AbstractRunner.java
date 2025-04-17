package com.tutorsdude.Ex;

import com.tutorsdude.Ex.Bike.Bike;
import com.tutorsdude.Ex.Bike.Honda;


public class AbstractRunner {
    public static void main(String[] args) {
        Bike b = new Honda();
        b.run();
    }
}

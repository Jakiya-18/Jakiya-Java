package com.tutorsdude.Inheritence;

import com.tutorsdude.Inheritence.Example.Vehicles;

public class Runner {

    public static void main(String[] args) {

        Vehicles vehicles = new Vehicles();
      vehicles.brand ="tata";
        System.out.println(vehicles.brand);

        Vehicles.Move();
    }
}

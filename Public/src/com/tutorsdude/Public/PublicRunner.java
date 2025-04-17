package com.tutorsdude.Public;

import com.tutorsdude.Public.Park.Park;

public class PublicRunner {
    public static void main(String[] args) {

        Park park = new Park();
        park.isAvailable(6);
        park.openGate();

        park.name = "Natinal park";
        System.out.println(park.name);

        park.entryFee = 500;
        System.out.println(park.entryFee);


    }
}

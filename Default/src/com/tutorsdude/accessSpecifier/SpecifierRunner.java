package com.tutorsdude.accessSpecifier;

import com.tutorsdude.accessSpecifier.Ex.NationalPark;
import com.tutorsdude.accessSpecifier.Ex.Park;

public class SpecifierRunner {
    public static void main(String[] args) {
        Park park = new Park();
        NationalPark park1 = new NationalPark();
        System.out.println(park1);
        System.out.println(park);
    }
}

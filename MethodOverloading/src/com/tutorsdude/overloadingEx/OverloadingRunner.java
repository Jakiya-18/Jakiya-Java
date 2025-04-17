package com.tutorsdude.overloadingEx;

import com.tutorsdude.overloadingEx.Restaurant.Restaurant;

public class OverloadingRunner {

    public static void main(String[] args) {

        Restaurant restaurant= new Restaurant();
    //changing the number of parameter
        int value = restaurant.salary(25000,52000);
        System.out.println(value);

        int value1 = restaurant.salary(25000,25000,25000);
        System.out.println(value1);
        //changing type of parameter

        restaurant.order("Masal dosa");
        restaurant.order("Masal dosa", 1);
        restaurant.order("Masal dosa", 1, "chutney");

        //changing the order of parameter

        restaurant.order(1,"Masal dosa");
        restaurant.order(1,"Masal dosa","chutney");


    }
}

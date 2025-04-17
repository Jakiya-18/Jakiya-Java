package com.tutorsdude.overloadingEx.Restaurant;

public class Restaurant {

//changing the number of parameter
    public static int salary(int salary1, int salary2){
        int salary = salary1 + salary2;
        return salary;
    }
    public static int salary(int salary1, int salary2, int salary3){
        int salary = salary1 + salary2 + salary3;
        return salary;
    }

    //changing type of parameter
    public void order(String foodItem){
        System.out.println("ordered : " + foodItem);
    }
    public void order(String foodItem, int quantity){
        System.out.println("Ordered : " + foodItem +" ," + quantity);
    }
    public void order(String foodItem, int quantity, String extraitems){
        System.out.println("Ordered : " + quantity  +" "+ foodItem + " with extra :" + extraitems);
    }

//changing the order of parameter
    public void order(int quantity, String foodItem){
        System.out.println("Ordered : " + foodItem +" ," + quantity);
    }
    public void order(int quantity, String foodItem, String extraitems) {
        System.out.println("Ordered : " + quantity + " " + foodItem + " with extra :" + extraitems);
    }
}

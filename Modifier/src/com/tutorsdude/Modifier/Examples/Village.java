package com.tutorsdude.Modifier.Examples;

public class Village {
    public static String villageName;
    public static int pincode;
    public String famousFor;
    public int colleges;
    public double weather;


    public static void villageDetails(){
        System.out.println("Village details.....");
    }
    public void displayHouses(){
        System.out.println("Displaying houses in gangavathi.....");
    }

    public void printAll(){
        System.out.println("Village name : " + villageName);
        System.out.println("Village pincode : " + pincode);
        System.out.println("Gangavathi is famous for : " + famousFor);
        System.out.println("Colleges in gangavathi :  " + colleges);
        System.out.println("Weather of village : " + weather);
    }
}

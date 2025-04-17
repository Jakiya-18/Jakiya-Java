package com.tutordude.accessspecifier.example;

public class Bike {


    private int id;
    private String name;
    private String brand;


    public Bike(int id, String name , String brand){
        this.id = id;
        this.name = name;
        this.brand = brand;
    }

    public static void wheels(){
        System.out.println("Bike have 2 wheels");
    }



    public static void main(String[] args) {


        Bike result = new Bike(1,"Zx10R","Kawasaki");
        System.out.println(result);
        System.out.println("Id : " + result.id);
        System.out.println("Name : " + result.name);
        System.out.println("Brand : " + result.brand);





    }

    }





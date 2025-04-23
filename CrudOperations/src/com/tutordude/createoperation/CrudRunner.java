package com.tutordude.createoperation;

public class CrudRunner {

    static String[] houseNames = new String[10];


    public static void main(String[] args) {
        addStrings("VT Manzil");
        addStrings("Jakiya's Manzil");
        addStrings("Vali's Villa");

       for (int i = 0; i< houseNames.length; i++){
         System.out.println(houseNames[i]);

       }

    }

    public static void addStrings(String name){
        for (int i = 0; i < houseNames.length; i++ ){
            if (houseNames[i]==null){
                houseNames[i] = name;
                return;
            }
        }
    }
}

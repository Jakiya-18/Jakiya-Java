package com.tutorsdude.Public.Park;

public class Park {
    public String name;
    public int entryFee;
    public int timing;


    public void openGate(){
        System.out.println("Gate is opened...");
    }

    public boolean isAvailable(int timing){
        if (timing >= 6 & timing <= 8){
            System.out.println("Park is available...");
            return true;
        }
        else {
            System.out.println("Park is Notavailable...");
            return false;
        }


    }

}

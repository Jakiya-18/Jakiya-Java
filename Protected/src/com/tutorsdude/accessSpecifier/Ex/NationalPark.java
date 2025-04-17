package com.tutorsdude.accessSpecifier.Ex;

public class NationalPark extends Park{

   public void printDetails() {
       if (entryFee == 0) {
           System.out.println("entry is free");
       } else {
           System.out.println("no " + name + " Requires an entry fee " + entryFee);
       }


   }

    public static void main(String[] args) {
        NationalPark park = new NationalPark();
        park.entryFee = 0;
        park.name = "National Park";

        park.printDetails();

    }
}

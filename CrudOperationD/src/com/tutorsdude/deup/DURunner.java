package com.tutorsdude.deup;

import com.tutorsdude.deup.Example.Zomato;

public class DURunner {
    public static void main(String[] args) {

        System.out.println("-------CREATE OPERATION-------");
        Zomato zomato = new Zomato();

        zomato.addOrder("Pizza");
        zomato.addOrder("Masal Dosa");
        zomato.addOrder("idli vada");
        zomato.addOrder("id");

        System.out.println("-------READ OPERATION-------");

        String[] read = zomato.readAll();

        for (int i = 0; i < read.length; i++) {
            System.out.println(read[i]);

        }

        System.out.println("-------FIND OPERATION-------");

        boolean result = zomato.find("Pizza");       //my yaha pizza order karu
        System.out.println("Order item found : " +result);

        boolean result2 = zomato.find("puri");
        System.out.println(result2);


        System.out.println("---------UPDATE OPERATION--------");

        boolean update = zomato.update("Pizza", "Vanila ice");
        System.out.println(update);

        String[] read1 = zomato.readAll();

        for (int i = 0; i < read1.length; i++) {
            System.out.println(read1[i]);
        }

        System.out.println("--------DELETE OPERATION---------");

        boolean delete= zomato.delete("idli vada");
        System.out.println(delete);

        boolean delete1 = zomato.delete("Pizza");
        System.out.println(delete1);

    }
}

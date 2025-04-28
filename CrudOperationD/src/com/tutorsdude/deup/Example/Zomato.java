package com.tutorsdude.deup.Example;

public class Zomato {

    String[] order = new String[5];


    public void addOrder(String name){
        if (name != null) {
            if (name.length() > 2) {
                for (int i = 0; i < order.length; i++) {
                    if (order[i] == null) {
                        order[i] = name;
                        System.out.println("Ordered the item : " +name);
                        return;
                    }

                }
                System.out.println("Add any orders");

            }
            else {
                System.out.println("Name lenth should b greater than 2");
            }

        }
        else {
            System.out.println("Add any orders");
        }
    }


    public String[] readAll(){
        return order;
    }


    public boolean find(String name1){
        for (int i = 0; i < order.length; i++) {
            if (order[i].equals(name1)) {
                return true;
            }
            else {
                System.out.println("Ordered item is not in list, please enter a valid item name...");
                return false;
            }
        }
        return false;
    }


    public boolean update(String oldValue, String newValue){
        if (newValue!= null && oldValue!=null) {
            for (int i = 0; i < order.length; i++) {
                if (order[i].equals(oldValue)) {
                    order[i] = newValue;
                    return true;
                }
                else {
                    return false;
                }

            }

        }
        System.out.println("Updated the value");
        return false;
    }

    public boolean delete(String value){
        for (int i = 0; i < order.length; i++) {
            if (order[i] != null) {
                order[i] = null;
                System.out.println("Deleted : " +value);
                return true;
            }
            else {
                System.out.println(value+ " -> Item not found" );
                return false;
            }

        }
        return false;

    }
}

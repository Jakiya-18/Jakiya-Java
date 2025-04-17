package com.tutordude.accessspecifier.example;

public class Clothes{
    private String brandName;
    private String type;
    private int price;
    private String category;
    private String pattern;

    private Clothes(){
        System.out.println("we have so many clothes");
    }

    private Clothes(String brandName, String type, int price, String category, String pattern) {
        this.brandName = brandName;
        this.type = type;
        this.price = price;
        this.category = category;
        this.pattern = pattern;

    }

        private void wearing(){
            System.out.println("Wearing clothes...");
        }

        public static void main(String [] args){
        Clothes clothes = new Clothes("Raymond", "Polyester",1000, "Shirt", "Check-shirt");
        System.out.println(clothes.brandName + " ," + clothes.type + ", "+clothes.pattern);

        Clothes clothes1 = new Clothes();
        System.out.println(clothes1);

         clothes.wearing();



    }


    }

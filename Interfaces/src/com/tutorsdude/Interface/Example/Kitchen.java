package com.tutorsdude.Interface.Example;

public class Kitchen implements House,Restaurant{
    public void cooking(){
        System.out.println("Cooking food");
    }
    public void deliciousFood(){
        System.out.println("Maggie is delicious");
    }
}

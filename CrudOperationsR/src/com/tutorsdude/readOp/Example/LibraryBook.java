package com.tutorsdude.readOp.Example;

public class LibraryBook {

    String[] title = new String[2];



    public void addBook(String book) {

        if (book != null) { // checking whether book is null
            if (book.length()>= 3){ // checking whether book length is greater than 3.

                for (int i =0; i < title.length; i++) { // to save the values

                    if (title[i] == null) { //check blank places
                        title[i] = book; //saving
                        System.out.println("Book title : " +book); //printing
                        return; //stop the method, becoz value is  saved once.

                    }
                }

                System.out.println("Saved values"); //printing the value


            }
            else { //if book length is not greater than 3, then else will b printing
                System.out.println("Book title length should be greater than 3");
            }

        }
        else {
            System.out.println("Book title is null");
        }
    }

    public String[] readAll(){
        return title;
    }

}

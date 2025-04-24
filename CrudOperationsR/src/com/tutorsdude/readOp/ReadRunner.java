package com.tutorsdude.readOp;

import com.tutorsdude.readOp.Example.LibraryBook;

public class ReadRunner {
    public static void main(String[] args) {

        LibraryBook lbook = new LibraryBook();

        lbook.addBook("The bible");

        lbook.addBook("th");

        lbook.addBook("Harry Potter Series");

        lbook.addBook(null);

        String[] allBooks = lbook.readAll();

        for (int i = 0; i<allBooks.length; i++){
            System.out.println(allBooks[i]);
        }


    }
}

package com.tutosdude.encapsulation;

import com.tutosdude.encapsulation.Ex.Book;

public class EncapsulationRunner {
    public static void main(String[] args) {

        Book book = new Book();

        System.out.println("********* BOOK DETAILS *********");
        book.setBookTitle("Atomic Habits");
        System.out.println(book.getBookTitle());
        book.setBookAuthor("James clear");
        System.out.println(book.getBookAuthor());
        book.setBookISBN("978-0-7352-1129-3");
        System.out.println(book.getBookISBN());
        book.setBookGenre("Personal Development");
        System.out.println(book.getBookGenre());
        book.setBookPrice(2500);
        System.out.println(book.getBookPrice());
        book.setPublicationDate("October 16, 2018");
        System.out.println(book.getPublicationDate());
        book.setNumberOfPages(320);
        System.out.println(book.getNumberOfPages());
        book.setLanguage("English");
        System.out.println(book.getLanguage());
        book.setPublisher("Penguin random house");
        System.out.println(book.getPublisher());
        book.setEdition("First edition");
        System.out.println(book.getEdition());

        System.out.println("********* LIBRARY DETAILS **********");
        book.setIsAvailable(true);
        System.out.println(book.getIsAvailable());
        book.setShelfNumber("B2-19");
        System.out.println(book.getShelfNumber());
        book.setRackId(8);
        System.out.println(book.getRackId());

        System.out.println("********** USER INFORMATION **********");
        book.setUserId(202);
        System.out.println(book.getUserId());
        book.setUserName("John Miller");
        System.out.println(book.getUserName());
        book.setUserEmail("johnmiller@gmail.com");
        System.out.println(book.getUserEmail());
        book.setUserPhone(9852365478L);
        System.out.println(book.getUserPhone());

        System.out.println("********** BORROWING INFORMATION **********");
        book.setBorrowedCount(28);
        System.out.println(book.getBorrowedCount());
        book.setDueDate("january 18 , 2026");
        System.out.println(book.getDueDate());
        book.setFineAmount(200);
        System.out.println(book.getFineAmount());

        System.out.println("********** TRANSACTION DETAILS **********");
        book.setBorrowDate("18-03-2025");
        System.out.println(book.getBorrowDate());
        book.setReturnDate("31-03-2025");
        System.out.println(book.getReturnDate());
        book.setOverdueDays(0);
        System.out.println(book.getOverdueDays());
        book.setFinePaid("no");
        System.out.println(book.getFinePaid());
    }
}

package com.company;

import java.util.ArrayList;
import java.util.List;


public class Main {
    static public void ShowAllBooks(List<Book> bookCollection) {
        Book GlobalBook = new Book();

        for (int i = 0; i < bookCollection.size(); i++) {
            GlobalBook = bookCollection.get(i);
            System.out.println("Name of book : " + GlobalBook.name + "\tAuthor : " + GlobalBook.author + "\tISBN : " + GlobalBook.ISBN + "\t Year : " + GlobalBook.yearOfPublishing);
        }
    }

    static public void SearchByName(String nameOfBook, List<Book> bookCollection) {
        Book GlobalBook = new Book();

        boolean result = false;
        for (int i = 0; i < bookCollection.size(); i++) {
            GlobalBook = bookCollection.get(i);
            if (nameOfBook==GlobalBook.name){
                result = true;
                System.out.println("Name of book : " + GlobalBook.name + "\tAuthor : " + GlobalBook.author + "\tISBN : " + GlobalBook.ISBN + "\t Year : " + GlobalBook.yearOfPublishing);
            }
        }
        if (result==false)
        {
            System.out.println("This book is not exist");
        }


    }

    static public void DeleteByISBN(String deletingISBN, List<Book> bookCollection) {
        Book GlobalBook = new Book();
        boolean result = false;
        for (int i = 0; i < bookCollection.size(); i++) {
            GlobalBook = bookCollection.get(i);
            if (deletingISBN==GlobalBook.ISBN){
                result = true;
                bookCollection.remove(GlobalBook);
                break;
            }
        }
        if(result == false)
        {
            System.out.println("Incorrect ISBN number");
        }
    }


    public static void main(String[] args) {
        //First task
        List<Book> bookCollection = new ArrayList<Book>();
        Book first = new Book();
        bookCollection.add(first);

        first.AddNewBook("The Great Gatsby", "Scott Fitzgerald", "156-5-48-785433-8", 1925);

        Book second = new Book();
        bookCollection.add(second);
        second.AddNewBook("Nineteen Eighty-Four", "George Orwell", "444-9-78-554884-0", 1949);

        Book third = new Book();
        bookCollection.add(third);
        third.AddNewBook("A Little Life", "Hanya Yanagihara", "588-8-10-584770-8", 2015);

        //Second task

        ShowAllBooks(bookCollection);

        //Third task
        System.out.println("\nSearching book is :");

        String nameOfSearchingBook1 = "The Great Gatsby";
        SearchByName(nameOfSearchingBook1, bookCollection);
        System.out.println("\nSecond try :\n");
        String nameOfSearchingBook2 = "The Gre  at Gatsby";
        SearchByName(nameOfSearchingBook2, bookCollection);
        System.out.println("\n");
        //Fourth task
        String searchingISDN = "156-5-48-785433-8";
        DeleteByISBN(searchingISDN, bookCollection);

        ShowAllBooks(bookCollection);
    }
}
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


    public static void main(String[] args) {
        //Book [] bookCollection=new Book;
        List<Book> bookCollection = new ArrayList<Book>();
        Book first = new Book ();
        bookCollection.add(first);

        first.AddNewBook("The Great Gatsby", "Scott Fitzgerald", "156-5-48-785433-8", 1925);

        Book second = new Book ();
        bookCollection.add(second);
        second.AddNewBook("Nineteen Eighty-Four", "George Orwell", "444-9-78-554884-0", 1949);
        ShowAllBooks(bookCollection);


       }
}
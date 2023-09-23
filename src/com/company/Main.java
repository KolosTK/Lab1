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


    public static void main(String[] args) {
        //First task
        List<Book> bookCollection = new ArrayList<Book>();
        Book first = new Book();
        bookCollection.add(first);

        first.AddNewBook("The Great Gatsby", "Scott Fitzgerald", "156-5-48-785433-8", 1925);

        Book second = new Book();
        bookCollection.add(second);
        second.AddNewBook("Nineteen Eighty-Four", "George Orwell", "444-9-78-554884-0", 1949);

        //Second task
        ShowAllBooks(bookCollection);

        //Third task
        String nameOfSearchingBook = "The Gre at Gatsby";
        SearchByName(nameOfSearchingBook, bookCollection);

        //Fourth rask
    }
}
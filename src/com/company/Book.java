package com.company;

import java.util.ArrayList;
import java.util.List;

public class Book {
    public String name,
            author,
            ISBN;
    public int yearOfPublishing;
    private List<Book> bookCollection = new ArrayList<Book>();

    public void AddNewBook(String name, String author, String ISBN, int yearOfPublishing) {
        this.name = name;
        this.author = author;
        this.ISBN = ISBN;
        this.yearOfPublishing = yearOfPublishing;
    }

    public void ShowAllBooks(List<Book> bookCollection) {
        Book GlobalBook = new Book();

        for (int i = 0; i < bookCollection.size(); i++) {
            GlobalBook = bookCollection.get(i);
            System.out.println("Name of book : " + GlobalBook.name + "\tAuthor : " + GlobalBook.author + "\tISBN : " + GlobalBook.ISBN + "\t Year : " + GlobalBook.yearOfPublishing);
        }
    }

}

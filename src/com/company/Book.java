package com.company;

public class Book {
    private String name,
            author,
            ISBN;
    private int yearOfPublishing;


    public void AddNewBook(String name, String author, String ISBN, int yearOfPublishing) {
        this.name = name;
        this.author = author;
        this.ISBN = ISBN;
        this.yearOfPublishing = yearOfPublishing;
    }

}
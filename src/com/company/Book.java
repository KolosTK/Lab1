package com.company;


public class Book {
    public String name,
            author,
            ISBN;
    public int yearOfPublishing;

    public void AddNewBook(String name, String author, String ISBN, int yearOfPublishing) {
        this.name = name;
        this.author = author;
        this.ISBN = ISBN;
        this.yearOfPublishing = yearOfPublishing;
    }



}

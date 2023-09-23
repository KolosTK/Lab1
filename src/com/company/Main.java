package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Book [] bookCollection=new Book;
        List<Book> bookCollection = new ArrayList<Book>();
        Book bookExample = new Book ();
        bookCollection.add(bookExample);

        bookExample.AddNewBook("451 Pharenheit", "Rey Bredbery", "12909-15134-612-2", 1853);
        bookExample.ShowAllBooks();
    }
}
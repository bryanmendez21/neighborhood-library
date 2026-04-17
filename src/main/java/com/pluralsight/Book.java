package com.pluralsight;

public class Book {

    // Variables
    int id;
    String isbn;
    String title;
    String checkedOutTo;
    boolean isCheckedOut;


    // Constructors
    public Book(int id) {
        this.id = id;
    }

    public Book(String isbn, String title, String checkedOutTo) {
        this.isbn = isbn;
        this.title = title;
        this.checkedOutTo = checkedOutTo;
    }

    public Book(boolean isCheckedOut) {
        this.isCheckedOut = isCheckedOut;
    }


    // Method




}

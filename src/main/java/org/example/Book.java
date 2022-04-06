package org.example;

public class Book {

    private  final Author author;
    private final String title;

    Book(Author author, String title) {
        this.author = author;
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    /**
     * Displays authors name
     */
    public void displayAuthor() {
        System.out.println("Author: " + author.getName());
    }
}

package org.example;

import java.util.Arrays;

public class Author {

    private Book[] books = new Book[0];
    private final String name;

    public Author(String name) {
        this.name = name;
    }

    /**
     * Check if a book with same title already exists for this author
     *
     * @param   title title of book
     * @return true if author already has this title, false if not
     */
    public boolean validateHasDuplicates(String title) {
        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(title))
                return true;
        }
        return false;
    }

    public void addBook(Book book) {
        //Validate
        if (validateHasDuplicates(book.getTitle()))
            return;
        this.books = Arrays.copyOf(this.books, this.books.length + 1);
        this.books[this.books.length - 1] = book;
    }

    public Book[] getBook() {
        return books;
    }

    public String getName() {
        return name;
    }

    public void displayTitlesForAuthor() {
        for (Book b : books) {
            System.out.println(b.getTitle());
        }
    }
}



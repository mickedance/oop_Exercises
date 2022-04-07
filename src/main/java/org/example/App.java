package org.example;

import java.util.Scanner;

/**
 * Exercise OOP
 * From course at lexicon, Sweden
 */
public class App {
    public static void main(String[] args) {
        System.out.println("####OOP Topic #####");
        
        // Ex1
        System.out.println("####EXERCISE 1 #####");

        Car car1 = new Car();
        car1.setMotorSize(122);
        car1.setModel("v70");
        car1.drive();
        // Ex2
        System.out.println("####EXERCISE 2 #####");

        Scanner sc = new Scanner(System.in);
        Rectangle rec = new Rectangle();
        System.out.println("Type a height: ");
        rec.setHeight(sc.nextDouble());
        System.out.println("Type a width: ");

        rec.setWidth(sc.nextDouble());

        System.out.println("Area is: " + rec.getArea());


        // EX3
        System.out.println("####EXERCISE 3 #####");

        Author[] authors;
        Author author1 = new Author("Nisse Kalberg");
        Author author2 = new Author("Anna Nilsson");
        Book[] books = new Book[6];

        for (int i = 0; i < books.length; i++) {
            if (i < 3) {
                books[i] = new Book(author1, "book title " + i);
                author1.addBook(books[i]);
            } else {
                books[i] = new Book(author2, "Svensk bok titel " + (i - 3));
                author2.addBook(books[i]);
            }
        }

        author1.displayTitlesForAuthor();
        author2.displayTitlesForAuthor();
        for (Book b : books)
            b.displayAuthor();
    }
}

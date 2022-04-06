package org.example;

import java.util.Scanner;

/**
 * Exercise OOP
 * From course at lexicon, Sweden
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // Ex1
        Car car1 = new Car();
        car1.setMotorSize(122);
        car1.setModel("v70");
        car1.drive();

        // Ex2
        Scanner sc = new Scanner(System.in);
        Rectangle rec = new Rectangle();
        System.out.println("Type a height: ");
        rec.setHeight(sc.nextDouble());
        System.out.println("Type a width: ");

        rec.setWidth(sc.nextDouble());

        System.out.println("Area is: " + rec.getArea());
    }
}

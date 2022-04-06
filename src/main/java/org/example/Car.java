package org.example;

/**
 * Class Car with
 */
public class Car {

    int id;
    int year;
    String model;
    String color;
    int motorSize;

    /**
     * Prints out a message of model+ motorsize car drive
     */
    public void drive() {
        System.out.println(model + " with motorSize " + motorSize + " can drive now");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMotorSize() {
        return motorSize;
    }
    public void setMotorSize(int motorSize) {
        this.motorSize = motorSize;
    }

}

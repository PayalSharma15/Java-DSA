package ConstructorOverloading;

public class Rectangle {

    double length;
    double width;

    // 1. No-argument constructor
    Rectangle() {
        length = 1;
        width = 1;
    }

    // 2. Constructor with one parameter
    // Square
    Rectangle(double side) {
        length = side;
        width = side;
    }

    // 3. Constructor with two parameters
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Calculate area
    double calculateArea() {
        return length * width;
    }

    // Display details
    void displayDetails() {
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area: " + calculateArea());
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {

        // Using no-argument constructor
        Rectangle rectangle1 = new Rectangle();

        // Using one-parameter constructor
        Rectangle rectangle2 = new Rectangle(5);

        // Using two-parameter constructor
        Rectangle rectangle3 = new Rectangle(10, 6);

        rectangle1.displayDetails();
        rectangle2.displayDetails();
        rectangle3.displayDetails();
    }
}
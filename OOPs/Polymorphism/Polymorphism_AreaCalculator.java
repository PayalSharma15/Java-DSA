package Polymorphism;

public class Polymorphism_AreaCalculator {

    // Area of Circle
    double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    // Area of Rectangle
    double calculateArea(double length, double breadth) {
        return length * breadth;
    }

    // Area of Square
    int calculateArea(int side) {
        return side * side;
    }

    public static void main(String[] args) {

        Polymorphism_AreaCalculator obj =
                new Polymorphism_AreaCalculator();

        System.out.println("Area of Circle: " +
                obj.calculateArea(5.0));

        System.out.println("Area of Rectangle: " +
                obj.calculateArea(10.0, 5.0));

        System.out.println("Area of Square: " +
                obj.calculateArea(4));
    }
}
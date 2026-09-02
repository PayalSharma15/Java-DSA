package Polymorphism;

public class Polymorphism_MethodOverloading {

    // 1. Two integers
    int add(int a, int b) {
        return a + b;
    }

    // 2. Three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // 3. Two double values
    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {

        Polymorphism_MethodOverloading obj =
                new Polymorphism_MethodOverloading();

        System.out.println(obj.add(10, 20));

        System.out.println(obj.add(10, 20, 30));

        System.out.println(obj.add(10.5, 20.5));
    }
}
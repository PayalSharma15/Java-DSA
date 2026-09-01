package Inheritance;

class Employee {

    String name = "Rahul";
}

public class SuperKeyword_Variable extends Employee {

    String name = "Priya";

    void displayNames() {
        System.out.println("Child Name: " + name);
        System.out.println("Parent Name: " + super.name);
    }

    public static void main(String[] args) {

        SuperKeyword_Variable manager = new SuperKeyword_Variable();

        manager.displayNames();
    }
}
package Inheritance;

class Animal {

    void eat() {
        System.out.println(" is eating");
    }

    void sleep() {
        System.out.println( " is sleeping");
    }
}

public class Inheritance_Animal extends Animal {

    void bark() {
        System.out.println( " is barking");
    }

    public static void main(String[] args) {

        Inheritance_Animal dog = new Inheritance_Animal();
        dog.eat();
        dog.sleep();
        dog.bark();
    }
}
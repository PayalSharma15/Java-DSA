package Inheritance;

class Person {

    String name = "Rahul";

    Person() {
        System.out.println("Person constructor called");
    }

    void display() {
        System.out.println("Person Name: " + name);
    }
}

public class SuperKeyword_Student extends Person {

    String name = "Priya";

    SuperKeyword_Student() {
        super();   // Parent constructor
    }

    @Override
    void display() {

        System.out.println("Child Name: " + this.name);
        System.out.println("Parent Name: " + super.name);

        super.display();   // Parent method
    }

    public static void main(String[] args) {

        SuperKeyword_Student student = new SuperKeyword_Student();

        student.display();
    }
}
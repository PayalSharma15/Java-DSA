package Inheritance;

class Employee {

    void work() {
        System.out.println("Employee is working");
    }
}

public class SuperKeyword_Method extends Employee {

    @Override
    void work() {
        super.work();   // Parent class method
        System.out.println("Manager is managing the team");
    }

    public static void main(String[] args) {

        SuperKeyword_Method manager = new SuperKeyword_Method();

        manager.work();
    }
}
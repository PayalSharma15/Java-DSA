package Inheritance;

class Person {

    String name;
    int age;

    void displayPersonDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Employee extends Person {

    int employeeId;
    double salary;

    void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Salary: " + salary);
    }
}

public class Inheritance_Manager extends Employee {

    String department;

    void displayManagerDetails() {
        displayPersonDetails();
        displayEmployeeDetails();
        System.out.println("Department: " + department);
    }

    public static void main(String[] args) {

        Inheritance_Manager manager = new Inheritance_Manager();

        manager.name = "Rahul";
        manager.age = 30;
        manager.employeeId = 101;
        manager.salary = 75000;
        manager.department = "IT";

        manager.displayManagerDetails();
    }
}
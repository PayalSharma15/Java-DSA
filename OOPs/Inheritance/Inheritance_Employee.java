package Inheritance;

class Employee {

    String name;
    int employeeId;
    double salary;

    void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

public class Inheritance_Employee extends Employee {

    String department;

    void displayManagerDetails() {
        displayEmployeeDetails();
        System.out.println("Department: " + department);
    }

    public static void main(String[] args) {

        Inheritance_Employee manager = new Inheritance_Employee();

        manager.employeeId = 101;
        manager.name = "Rahul";
        manager.salary = 60000;
        manager.department = "IT";

        manager.displayManagerDetails();
    }
}
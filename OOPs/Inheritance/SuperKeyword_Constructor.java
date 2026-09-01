package Inheritance;

class Employee {

    String name;
    int employeeId;

    Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    void displayEmployeeDetails() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
    }
}

public class SuperKeyword_Constructor extends Employee {

    String department;

    SuperKeyword_Constructor(String name, int employeeId, String department) {

        super(name, employeeId);   // Parent constructor call

        this.department = department;
    }

    void displayDetails() {

        displayEmployeeDetails();
        System.out.println("Department: " + department);
    }

    public static void main(String[] args) {

        SuperKeyword_Constructor employee =
                new SuperKeyword_Constructor("Rahul", 101, "IT");

        employee.displayDetails();
    }
}
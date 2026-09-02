package Inheritance;

class Employee {

    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

public class SuperKeyword_Employee extends Employee {

    String department;

    SuperKeyword_Employee(String name, double salary, String department) {

        super(name, salary);       // Parent constructor
        this.department = department;
    }

    @Override
    void displayDetails() {

        super.displayDetails();   // Parent method
        System.out.println("Department: " + department);
    }

    public static void main(String[] args) {

        SuperKeyword_Employee employee =
                new SuperKeyword_Employee("Rahul", 60000, "IT");

        employee.displayDetails();
    }
}
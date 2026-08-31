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

class Developer extends Employee {

    String programmingLanguage;

    void displayDeveloperDetails() {
        displayEmployeeDetails();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

class Manager extends Employee {

    String department;

    void displayManagerDetails() {
        displayEmployeeDetails();
        System.out.println("Department: " + department);
    }
}

public class Inheritance_Hierarchical {

    public static void main(String[] args) {

        Developer developer = new Developer();

        developer.employeeId = 101;
        developer.name = "Rahul";
        developer.salary = 60000;
        developer.programmingLanguage = "Java";

        System.out.println("Developer Details:");
        developer.displayDeveloperDetails();

        System.out.println();

        Manager manager = new Manager();

        manager.employeeId = 102;
        manager.name = "Priya";
        manager.salary = 80000;
        manager.department = "IT";

        System.out.println("Manager Details:");
        manager.displayManagerDetails();
    }
}
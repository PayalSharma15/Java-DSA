package ConstructorOverloading;

public class Employee {

    int employeeId;
    String name;
    String department;
    double salary;

    // 1. No-argument constructor
    Employee() {
        employeeId = 0;
        name = "Unknown";
        department = "Not Assigned";
        salary = 0;
    }

    // 2. Constructor with name
    Employee(String name) {
        this.name = name;
        employeeId = 0;
        department = "Not Assigned";
        salary = 0;
    }

    // 3. Constructor with name and department
    Employee(String name, String department) {
        this.name = name;
        this.department = department;
        employeeId = 0;
        salary = 0;
    }

    // 4. Constructor with all details
    Employee(int employeeId, String name, String department, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {

        Employee employee1 = new Employee();

        Employee employee2 = new Employee("Payal");

        Employee employee3 = new Employee("Rahul", "IT");

        Employee employee4 =
                new Employee(104, "Priya", "HR", 55000);

        employee1.displayDetails();
        employee2.displayDetails();
        employee3.displayDetails();
        employee4.displayDetails();
    }
}
package Encapsulation;

public class Encapsulation_Employee {

    private int employeeId;
    private String name;
    private String department;
    private double salary;

    // Getter and Setter for employeeId
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for department
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    // Getter for salary
    public double getSalary() {
        return salary;
    }

    // Setter for salary with validation
    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Salary cannot be negative");
        }
    }

    // Display details
    public void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {

        Encapsulation_Employee employee1 =
                new Encapsulation_Employee();

        employee1.setEmployeeId(101);
        employee1.setName("Rahul");
        employee1.setDepartment("IT");
        employee1.setSalary(50000);

        employee1.displayDetails();

        // Testing validation
        employee1.setSalary(-10000);
    }
}
package Polymorphism;

public class Polymorphism_Employee {

    // Salary without bonus
    double calculateSalary(double basicSalary) {
        return basicSalary;
    }

    // Salary with fixed bonus
    double calculateSalary(double basicSalary, double bonus) {
        return basicSalary + bonus;
    }

    // Salary with bonus and allowance
    double calculateSalary(double basicSalary, double bonus, double allowance) {
        return basicSalary + bonus + allowance;
    }

    public static void main(String[] args) {

        Polymorphism_Employee employee =
                new Polymorphism_Employee();

        System.out.println("Salary: " +
                employee.calculateSalary(30000));

        System.out.println("Salary with Bonus: " +
                employee.calculateSalary(30000, 5000));

        System.out.println("Salary with Bonus and Allowance: " +
                employee.calculateSalary(30000, 5000, 3000));
    }
}
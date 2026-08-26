package Constructor;

public class Constructor_Employee {
   int employeeId;
    String name;
    String department;
    double salary;
    Constructor_Employee(int employeeId, String name, String department, double salary){
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
    void displayDetails(){
        System.out.println("Employee ID:" + employeeId);
        System.out.println("Employee Name:" + name);
        System.out.println("Employee Department:" + department);   
        System.out.println("Employee Salary:" + salary);
     }
    public static void main(String[] args){
       Constructor_Employee employee1 = new Constructor_Employee(101, "John Doe", "IT", 50000);
       employee1.displayDetails();
    }
}

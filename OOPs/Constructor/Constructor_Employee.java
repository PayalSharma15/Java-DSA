package Constructor;

public class Constructor_Employee {
   int employeeId;
    String name;
    String department;
    double salary;
    Constructor_Employee(){
        employeeId = 101;
        name = "John Doe";
        department = "IT";
        salary = 50000;
        
    }
    void displayDetails(){
        System.out.println("Employee ID:" + employeeId);
        System.out.println("Employee Name:" + name);
        System.out.println("Employee Department:" + department);   
        System.out.println("Employee Salary:" + salary);
     }
    public static void main(String[] args){
       Constructor_Employee employee1 = new Constructor_Employee();
       employee1.displayDetails();
    }
}

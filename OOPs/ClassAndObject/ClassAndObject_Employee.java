package ClassAndObject;
public class ClassAndObject_Employee {
    int Id;
    String name;
    String departement;
    long salary;

    public void displayDetails(){
        System.out.println("Employee Id:"+Id);
        System.out.println("Employee Name:"+name);
        System.out.println("Employee Departement:"+departement);
        System.out.println("Employee Salary:"+salary);
        System.out.println("-----------------------------");
    }
    public static void main(String[] args){
        ClassAndObject_Employee emp1 = new ClassAndObject_Employee();
        emp1.Id = 101;
        emp1.name = "John";
        emp1.departement = "IT";
        emp1.salary = 50000;
        emp1.displayDetails();

        ClassAndObject_Employee emp2 = new ClassAndObject_Employee();
        emp2.Id = 102;
        emp2.name = "Alice";
        emp2.departement = "HR";
        emp2.salary = 60000;
        emp2.displayDetails();

         ClassAndObject_Employee emp3 = new ClassAndObject_Employee();
        emp3.Id = 103;
        emp3.name = "Bob";
        emp3.departement = "Finance";
        emp3.salary = 70000;   
        emp3.displayDetails();
    
    }
}
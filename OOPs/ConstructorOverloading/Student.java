package ConstructorOverloading;

public class Student {
    String name;
    int age;
    String course;

   Student() {
        name = "John Doe";
        age = 20;
        course = "Computer Science";
    }
    Student(String name, int age, String course){
        this.name = name;
        this.age = age;
        this.course = course;
    }
    void displayDetails(){
        System.out.println("Name:"+ name);
        System.out.println("Age:"+ age);
        System.out.println("Course:"+ course);
        System.out.println("-------------------------");
    }
    public static void main(String[]args){
        Student student1 = new Student();
        student1.displayDetails();
        Student student2 = new Student("Alice Smith", 22, "Mathematics");
        student2.displayDetails();
    }
}

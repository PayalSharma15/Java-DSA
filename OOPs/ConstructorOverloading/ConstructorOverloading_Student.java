package ConstructorOverloading;

public class ConstructorOverloading_Student {
    String name;
    int age;
    String course;

   ConstructorOverloading_Student() {
        name = "John Doe";
        age = 20;
        course = "Computer Science";
    }
    ConstructorOverloading_Student(String name, int age, String course){
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
        ConstructorOverloading_Student student1 = new ConstructorOverloading_Student();
        student1.displayDetails();
        ConstructorOverloading_Student student2 = new ConstructorOverloading_Student("Alice Smith", 22, "Mathematics");
        student2.displayDetails();
    }
}

package ClassAndObject;

public class ClassAndObject_Student {
    String name;
    int age;
    String course;
    public void displayDetails(){
        System.out.println("Name:"+ name);
        System.out.println("Age:"+ age);
        System.out.println("Course:"+ course);
        System.out.println("-------------------------");
    }

                public static void main(String[] args) {
        ClassAndObject_Student student1 = new ClassAndObject_Student();
        student1.name = "John";
        student1.age = 22;
        student1.course = "Computer Science";
        student1.displayDetails();
    
        ClassAndObject_Student student2 = new ClassAndObject_Student();
        student2.name = "Alice";
        student2.age = 21;
        student2.course = "MCA";
        student2.displayDetails();

        ClassAndObject_Student student3 = new ClassAndObject_Student();
        student3.name = "Bob";
        student3.age = 23;
        student3.course = "Mechanical Engineering";
        student3.displayDetails();

}
}
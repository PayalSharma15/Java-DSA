package Constructor;

public class Constructor_Student {
    String name;
    int age;
    String course;

   Constructor_Student() {
        name = "John Doe";
        age = 20;
        course = "Computer Science";
    }
    void displayDetails(){
        System.out.println("Name:"+ name);
        System.out.println("Age:"+ age);
        System.out.println("Course:"+ course);
        System.out.println("-------------------------");
    }
    public static void main(String[]args){
        Constructor_Student student1 = new Constructor_Student();
        student1.displayDetails();
    }
}

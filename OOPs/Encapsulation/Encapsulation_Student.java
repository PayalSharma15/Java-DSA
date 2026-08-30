package Encapsulation;

public class Encapsulation_Student {
    private String name;
    private int age;
    private String course;

public String getName(){
    return name;
}
public void setName(String name){
    this.name = name;
}
public int getAge(){
    return age;
}
public void setAge(int age){
    this.age = age;
}
public String getCourse(){
    return course;
}
public void setCourse(String course){
    this.course = course;
}
public void displayDetails(){
    System.out.println("Name = " + name);
    System.out.println("Age = " + age);
    System.out.println("Course = " + course);
}
public static void main(String[] args){
    Encapsulation_Student student1 = new Encapsulation_Student();
    student1.setName("Rahul");
    student1.setAge(20);
    student1.setCourse("Java Programming");
    student1.displayDetails();
     Encapsulation_Student student2 = new Encapsulation_Student();
     
    student2.setName("Khushi");
    student2.setAge(20);
    student2.setCourse("Java Programming");
    student2.displayDetails();
}
}

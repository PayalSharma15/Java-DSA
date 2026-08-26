package ClassAndObject;

public class ClassAndObject_Car {
     String brand;
    String model;
    int year;
    double price;

    public void start() {
        System.out.println("Car is starting...");
    }

    public void stop() {
        System.out.println("Car is stopping...");
    }

    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Price: " + price);
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {

        ClassAndObject_Car car1 = new ClassAndObject_Car();
        car1.brand = "Toyota";
        car1.model = "Fortuner";
        car1.year = 2024;
        car1.price = 3500000;

        car1.displayDetails();
        car1.start();
        car1.stop();

        ClassAndObject_Car car2 = new ClassAndObject_Car();
        car2.brand = "Hyundai";
        car2.model = "Creta";
        car2.year = 2025;
        car2.price = 1800000;

        car2.displayDetails();
        car2.start();
        car2.stop();

        ClassAndObject_Car car3 = new ClassAndObject_Car();
        car3.brand = "Tata";
        car3.model = "Nexon";
        car3.year = 2024;
        car3.price = 1200000;

        car3.displayDetails();
        car3.start();
        car3.stop();
    }
}

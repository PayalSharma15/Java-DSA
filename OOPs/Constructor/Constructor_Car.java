package Constructor;

public class Constructor_Car {
    String brand;
    String model;
    int year;
    double price;
    Constructor_Car(String brand,String model,int year,double price){
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
    }
    public void displayDetails(){
        System.out.println("Car Brand:"+ brand);
        System.out.println("Car Model:"+ model);
        System.out.println("Car Year:"+ year);
        System.out.println("Car Price:"+ price);
    }
    public static void main(String[] args){
        Constructor_Car car1 = new Constructor_Car("Toyota","Camry",2022,30000);
        car1.displayDetails();
    }
}

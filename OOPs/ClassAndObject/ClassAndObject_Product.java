package ClassAndObject;

public class ClassAndObject_Product {

    int productId;
    String name;
    double price;
    int quantity;

    public void displayDetails() {
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
    }

    public double calculateTotal() {
        return price * quantity;
    }

    public static void main(String[] args) {

        ClassAndObject_Product product1 =
                new ClassAndObject_Product();

        product1.productId = 101;
        product1.name = "Laptop";
        product1.price = 55000;
        product1.quantity = 2;

        product1.displayDetails();
        System.out.println("Total: " + product1.calculateTotal());
        System.out.println("-------------------------");


        ClassAndObject_Product product2 =
                new ClassAndObject_Product();

        product2.productId = 102;
        product2.name = "Mouse";
        product2.price = 800;
        product2.quantity = 3;

        product2.displayDetails();
        System.out.println("Total: " + product2.calculateTotal());
        System.out.println("-------------------------");


        ClassAndObject_Product product3 =
                new ClassAndObject_Product();

        product3.productId = 103;
        product3.name = "Keyboard";
        product3.price = 1500;
        product3.quantity = 2;

        product3.displayDetails();
        System.out.println("Total: " + product3.calculateTotal());
        System.out.println("-------------------------");
    }
}
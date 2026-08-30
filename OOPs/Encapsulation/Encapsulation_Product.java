package Encapsulation;

public class Encapsulation_Product {

    private int productId;
    private String name;
    private double price;
    private int quantity;

    // Getter and Setter for productId
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter for price
    public double getPrice() {
        return price;
    }

    // Setter for price with validation
    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Price must be greater than 0");
        }
    }

    // Getter for quantity
    public int getQuantity() {
        return quantity;
    }

    // Setter for quantity with validation
    public void setQuantity(int quantity) {
        if (quantity >= 0) {
            this.quantity = quantity;
        } else {
            System.out.println("Quantity cannot be negative");
        }
    }

    // Calculate total price
    public double calculateTotal() {
        return price * quantity;
    }

    // Display product details
    public void displayDetails() {
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price: " + calculateTotal());
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {

        Encapsulation_Product product1 =
                new Encapsulation_Product();

        product1.setProductId(101);
        product1.setName("Laptop");
        product1.setPrice(55000);
        product1.setQuantity(2);

        product1.displayDetails();

        // Testing validation
        product1.setPrice(-500);
        product1.setQuantity(-2);
    }
}
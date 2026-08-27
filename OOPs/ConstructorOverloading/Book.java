package ConstructorOverloading;

public class Book {

    int bookId;
    String title;
    String author;
    double price;

    // 1. No-argument constructor
    Book() {
        bookId = 0;
        title = "Unknown";
        author = "Unknown";
        price = 0;
    }

    // 2. Constructor with title
    Book(String title) {
        this.title = title;
        bookId = 0;
        author = "Unknown";
        price = 0;
    }

    // 3. Constructor with title and author
    Book(String title, String author) {
        this.title = title;
        this.author = author;
        bookId = 0;
        price = 0;
    }

    // 4. Constructor with all details
    Book(int bookId, String title, String author, double price) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {

        Book book1 = new Book();

        Book book2 = new Book("Java Programming");

        Book book3 = new Book("Effective Java", "Joshua Bloch");

        Book book4 = new Book(
                104,
                "Head First Java",
                "Kathy Sierra",
                799
        );

        book1.displayDetails();
        book2.displayDetails();
        book3.displayDetails();
        book4.displayDetails();
    }
}
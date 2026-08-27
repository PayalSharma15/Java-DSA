package Constructor;

public class Constructor_Book {
    int bookId;
    String title;
    String author;
    int price;
    Constructor_Book(){
        bookId=101;
        title="Java Programming";
        author="Jemes Gosling";
        price=599;
    }
    public void displayDetails(){
        System.out.println("Book ID:"+ bookId);
        System.out.println("Book Title:"+ title);
        System.out.println("Book Author:"+ author);
        System.out.println("Book Price:"+ price);
    
    }
    public static void main(String[] args){
        Constructor_Book book1 = new Constructor_Book();
        book1.displayDetails();
    }
}

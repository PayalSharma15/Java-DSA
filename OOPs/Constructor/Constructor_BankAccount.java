package Constructor;

public class Constructor_BankAccount {

    long accountNumber;
    String accountHolder;
    double balance;

    // Parameterized Constructor
    Constructor_BankAccount(long accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {

        Constructor_BankAccount account1 =
                new Constructor_BankAccount(1001, "Rahul", 25000);

        Constructor_BankAccount account2 =
                new Constructor_BankAccount(1002, "Priya", 35000);

        Constructor_BankAccount account3 =
                new Constructor_BankAccount(1003, "Amit", 50000);

        account1.displayDetails();
        account2.displayDetails();
        account3.displayDetails();
    }
}
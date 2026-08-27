package ConstructorOverloading;

public class BankAccount {

    int accountNumber;
    String holderName;
    double balance;

    // 1. No-argument constructor
    BankAccount() {
        this(0, "Unknown", 0);
    }

    // 2. Constructor with holder name
    BankAccount(String holderName) {
        this(0, holderName, 0);
    }

    // 3. Constructor with holder name and balance
    BankAccount(String holderName, double balance) {
        this(0, holderName, balance);
    }

    // 4. Constructor with all details
    BankAccount(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: " + balance);
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {

        BankAccount account1 = new BankAccount();

        BankAccount account2 = new BankAccount("Payal");

        BankAccount account3 = new BankAccount("Rahul", 25000);

        BankAccount account4 =
                new BankAccount(1004, "Priya", 50000);

        account1.displayDetails();
        account2.displayDetails();
        account3.displayDetails();
        account4.displayDetails();
    }
}
package Encapsulation;

public class Encapsulation_BankAccount {

    private long accountNumber;
    private String accountHolder;
    private double balance;

    // Getter for accountNumber
    public long getAccountNumber() {
        return accountNumber;
    }

    // Setter for accountNumber
    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    // Getter for accountHolder
    public String getAccountHolder() {
        return accountHolder;
    }

    // Setter for accountHolder
    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Amount deposited: " + amount);
        } else {
            System.out.println("Invalid amount");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount");
        } else if (amount > balance) {
            System.out.println("Insufficient balance");
        } else {
            balance = balance - amount;
            System.out.println("Amount withdrawn: " + amount);
        }
    }

    // Display details
    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {

        Encapsulation_BankAccount account =
                new Encapsulation_BankAccount();

        account.setAccountNumber(1001);
        account.setAccountHolder("Rahul");

        account.deposit(10000);
        account.deposit(5000);
        account.withdraw(3000);

        account.displayDetails();
    }
}
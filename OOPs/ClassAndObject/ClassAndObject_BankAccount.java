package ClassAndObject;

public class ClassAndObject_BankAccount {
    long accountNumber;
    String accountHolderName;
    double balance;
   void deposit(double amount){
       balance = balance + amount;
       System.out.println("Amount Deposited: "+amount);
    }
   void withdraw(double amount){
         if(amount <= balance){
            balance = balance - amount;
            System.out.println("Amount Withdrawn:"+amount);
        }else{
            System.out.println("Insufficient Balance");
         }
    }   
    void displayAccountDetails(){
        System.out.println("Account Number:"+accountNumber);
        System.out.println("Account Holder Name:"+accountHolderName);
        System.out.println("Account Balance:"+balance);
        System.out.println("-----------------------------");
    }
    public static void main(String[] args){
        ClassAndObject_BankAccount account1 = new ClassAndObject_BankAccount();
        account1.accountNumber = 123456789;
        account1.accountHolderName = "John Doe";
        account1.balance = 1000.0;
        account1.displayAccountDetails();

        account1.deposit(5000.0);
        account1.withdraw(2000.0);
        account1.displayAccountDetails();

    } 
}

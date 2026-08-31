// Create a BankAccount class with a private balance data member. Use a parameterized constructor to initialize the balance. 
// Provide getter and setter methods to access and update the balance. Create deposit() and withdraw() methods to deposit and withdraw money. 
// The withdraw() method should not allow withdrawal if the requested amount is greater than the available balance. Create an object in main() 
// and demonstrate all the operations.


class BankAccount{
    private double balance;

BankAccount(double balance){
    this.balance=balance;
}
public void setBalance(double balance){
    this.balance=balance;
}
public double getBalance(){
    return balance;
}
public void deposit(double amount) {
    balance = balance + amount;
    System.out.println("Deposit Successful: " + balance);
}

public void withdraw(double amount) {
    if (balance >= amount) {
        balance = balance - amount;
        System.out.println("Withdraw Successful: " + balance);
    } else {
        System.out.println("Withdraw Failed: Insufficient Balance");
    }
}
}
public class Bank {
    public static void main(String[] args) {
        BankAccount b=new BankAccount(12000);
         System.out.println("Current Balance: " + b.getBalance());
        b.deposit(3000);
        b.withdraw(500);
        b.withdraw(20000);
        b.setBalance(123999);
        System.out.println("Updated Balance: " + b.getBalance());
        b.withdraw(500);
    }

}

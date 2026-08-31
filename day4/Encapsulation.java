// Create a BankAccount class with private accountNo, public name, and balance data members. 
// Use a parameterized constructor, getter and setter methods to access the data, and a display() method to show the account information. 
// Create an object in main() and display its details

class BankAccount{
private int accountno;
public String name;
private double balance;

BankAccount(int accountno, String name, double balance){
this.accountno=accountno;
this.name=name;
this.balance=balance;
}
public void setAccountno(int accountno){
    this.accountno=accountno;
}
public int getAccountno(){
    return accountno;
}
public void setBalance(double balance){
    this.balance=balance;
}
public double getBalance(){
    return balance;
}
public void display(){
    System.out.println("Account number: "+accountno);
    System.out.println("Name: "+name);
    System.out.println("Balance: "+balance);
}
}

public class Encapsulation {
    public static void main(String[] args) {
        BankAccount b=new BankAccount(114243, "Ram", 100000);
        b.setAccountno(132443);
        b.setBalance(10006);
        b.display();

    }}

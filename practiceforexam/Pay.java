// Write a Java program by creating an interface Payment with a method pay(). Create two classes, Esewa and Khalti, that implement the interface
//  and provide their own implementation of the pay() method. Create objects of both classes and call the method.

interface Payment{
public void pay();
}
class Esewa implements Payment{
    public void pay(){
        System.out.println("YOu have 100 rupess in your Esewa account");
    }
}
class Khalti implements Payment{
public void pay(){
    System.out.println("You have 500 in your khalti account");
}
}
public class Pay{
    public static void main(String[] args){
        Esewa e=new Esewa();
        Khalti k=new Khalti();
        e.pay();
        k.pay();
    }
}

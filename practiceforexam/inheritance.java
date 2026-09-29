// Write a Java program to create a superclass named Vehicle with a method start(), and create two subclasses named Car and Bike that override
//  the start() method. Create objects of both subclasses and demonstrate method overriding.

class Vehicle{
    public void start(){
System.out.println("This is super class");
    }
}
class Car extends Vehicle{
    @Override
    public void start(){
        System.out.println("This is subclass Car");
    }
}
class Bike extends Vehicle{
    @Override 
    public void start(){
        System.out.println("This is subclass Bike");
    }
}

public class inheritance {
    public static void main(String[] args) {
Vehicle v = new Car();
        v.start();
        Vehicle v1=new Bike();
        v1.start();
    }}


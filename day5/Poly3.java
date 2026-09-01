// Write a Java program to demonstrate runtime polymorphism by creating a superclass Shape with a method draw(), and 
// two subclasses Circle and Rectangle that override the draw() method. Use a Shape reference to create objects of both subclasses and 
// invoke the overridden methods.

class Shape{
    public void draw(){
System.out.println("This is super class");
    }
}
class Circle extends Shape{
    @Override
     public void draw(){
System.out.println("This is circle");
    }
}
class Rectangle extends Shape{
    @Override
    public void draw(){
System.out.println("This is rectangle");
    }
}
public class Poly3 {
    public static void main(String[] args) {
        Shape s=new Circle();
        Shape s1=new Rectangle();
        s.draw();
        s1.draw();

    }
}

// Write a Java program to create an abstract class named Shape with an abstract method area(). Create two subclasses named Circle and Rectangle 
// that implement the area() method, and use a superclass reference to demonstrate runtime polymorphism.

abstract class Shape{
    abstract void area();
}
class Circle extends Shape{
    double radius=7;
    @Override 
    void area(){
    
System.out.println("Area of Circle: "+(3.14*radius*radius));
    }
}
class Rectangle extends Shape{
    int length=7;
    int breadth=7;
    @Override 
    void area(){
System.out.println("Area of Rectange: "+(length*breadth));
    }
}
public class polymorphsim {
    public static void main(String[] args){
        Shape s=new Circle();
        s.area();
        Shape s1 = new Rectangle();
        s1.area();
    }
}

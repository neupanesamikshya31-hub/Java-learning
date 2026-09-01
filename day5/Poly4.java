// Write a Java program to demonstrate compile-time polymorphism using method overloading to calculate the area of different shapes, 
// where the area() method accepts different parameters for a circle, rectangle, and triangle, and display the calculated areas.

class Shapes{

    //area of circle
    public double area(double r){
        return Math.PI*r*r;
    }
    public int area(int l, int b){
        return l*b;
    }
    public double area(double b, double h){
        return (b*h)/2;
    }
}

public class Poly4 {
    public static void main(String[] args) {
        Shapes s=new Shapes();
        System.out.println("Circle: "+s.area(2,2));
         System.out.println("Rectangle: "+s.area(2,2));
          System.out.println("Triangle: "+s.area(2.0,2.5));

    }
}

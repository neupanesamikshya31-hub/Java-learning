// Q. Write a Java program to create an abstract class Animal containing a name field and an abstract method sound(). 
// Create Dog and Cat subclasses that override the sound() method. Demonstrate runtime polymorphism using an Animal reference, perform upcasting
//  and downcasting, and use the instanceof operator before downcasting. Also create a generic Box<T> class to store and display a value.

abstract class Animal{
    String name;
abstract void sound();
}
class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Dog barks");
    }
}
class Cat extends Animal{
    @Override
    void sound(){
        System.out.println("Cat meow");
    }
}
public class Main {
 public static void main(String[] args) {
     Animal an=new Dog();
     Animal a1=new Cat();
     an.sound();
     a1.sound();

    if (a1 instanceof Cat) {
            Cat a2 = (Cat) a1;
            a2.sound();
        }
    }
}
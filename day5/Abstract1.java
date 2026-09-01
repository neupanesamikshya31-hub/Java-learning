// Write a Java program to demonstrate the use of an abstract class by creating an abstract class Animal with an abstract method sound(), 
// and subclasses Dog and Cat that implement the sound() method to display their respective sounds.

abstract class Animal{
    abstract void sound();
}
class Dog extends Animal{
    @Override
    public void sound(){
        System.out.println("Dog barks");
    }
}
class Cat extends Animal{
    @Override
    public void sound(){
        System.out.println("Cat meow");
    }
}
public class Abstract1 {
 public static void main(String[] args){
Animal a = new Dog();
Animal a1 =new Cat();
a.sound();
a1.sound();
 }

}

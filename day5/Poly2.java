// Write a Java program to demonstrate runtime polymorphism by creating a superclass Employee with a work() method and two subclasses 
// Manager and Developer that override the work() method, and use an Employee reference to call the overridden methods.

class Employee{
    public void work(){
System.out.println("This is super class");
    }

}
class Manager extends Employee{
    @Override
    public void work(){
        System.out.println("Manager manages the team");
    }
}
class Developer extends Employee{
    @Override
    public void work(){
        System.out.println("Developer develops the software");
    }
}
public class Poly2 {
    public static void main(String[] args) {
        Employee e1=new Manager();
        Employee e2=new Developer();
        e1.work();
        e2.work();
    }
    
}

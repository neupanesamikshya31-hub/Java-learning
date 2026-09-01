// Write a Java program to create an abstract class Employee containing an abstract method calculateSalary() and a concrete method displayEmployee(),
//  and create two subclasses FullTimeEmployee and PartTimeEmployee that implement calculateSalary() differently. Use an Employee reference 
//  to create objects of both subclasses and display their names and calculated salaries.


abstract class Employee{
    abstract int calculateSalary();
    
    void displayEmployee(){
        
System.out.println("Employee");
    }
}
class FullTimeEmployee extends Employee{
    @Override
    public int calculateSalary(){
        return 5000;
    }
    @Override
    void displayEmployee(){
       String name="Ram";
    System.out.println("name: "+name);
    System.out.println("Salary: "+calculateSalary());
    }

}
class PartTimeEmployee extends Employee{
    @Override
    public int calculateSalary(){
        return 80*500;
    }
    @Override
    void displayEmployee(){
       String name="Shyam";
    System.out.println("name: "+name);
    System.out.println("Salary: "+calculateSalary());
    }
}

public class Abstract2 {
    public static void main(String[] args) {
        Employee e= new FullTimeEmployee();
        Employee e1 = new PartTimeEmployee();
         e.displayEmployee();
        e1.displayEmployee();
    }
}

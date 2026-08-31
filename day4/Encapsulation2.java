// Create a class Employee with private id, name, and salary data members. Use a parameterized constructor to initialize them. 
// Create getter methods for all data members and a setter method for salary. Add a method calculateBonus() that returns 10% of the salary and 
// a display() method to show the employee's details and bonus. In main(), create an object, display its information, update the salary using the 
// setter, and display the updated information.

class Employee{
    private int id;
    private String name;
    private double salary;

Employee(int id, String name, double salary){
    this.id=id;
    this.name=name;
    this.salary=salary;
}
public int getId(){
    return id;
}
public String getName(){
    return name;
}
public void setSalary(double salary){
    this.salary=salary;

}
public double getSalary(){
    return salary;
}
public double calculateBonus(){
    return salary*0.10;
}
public void display(){
    System.out.println("Name: "+name);
    System.out.println("Id: "+id);
    System.out.println("Salary: "+salary);
  

}
}
public class Encapsulation2 {
    public static void main(String[] args) {
        Employee e=new Employee(1234, "Samikshya",10000000);
        System.out.println("Employee information");
        e.display();
System.out.println("");
        e.setSalary(1500000);
           System.out.println("After salary Update ");
        e.display();
    }
    
}

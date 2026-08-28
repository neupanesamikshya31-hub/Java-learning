// Write a Java program to create an Employee class with name, id, and salary as data members. Define a parameterized constructor
//  to initialize the employee details and a display() method to display the employee information. 
//  Create an array of 3 Employee objects and display the information of all employees.

class Employee{
String name;
int id;
double salary;

Employee(String name, int id, double salary){
    this.name=name;
    this.id=id;
    this.salary=salary;
}
public void display(){
    System.out.println("Name: "+name);
    System.out.println("Id: "+id);
    System.out.println("Salary: "+salary);
}
}
public class array {
 public static void main(String[] args) {
    Employee[] employee=new Employee[3];
    employee[0]=new Employee("Ram", 1244, 100000);
      employee[1]=new Employee("Shyam", 1433, 200000);
        employee[2]=new Employee("Hari", 1424, 300000);
          
employee[0].display();
employee[1].display();
employee[2].display();

 }   
}

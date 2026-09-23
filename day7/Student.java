// Q. Write a Java program to create a Student class with name, rollNo, and marks. Use a parameterized constructor to initialize the data and 
// create a method to display the student's details. Create three Student objects and display their details.

class std{
    String name;
    int rollno;
    int marks;

std(String name, int rollno, int marks){
this.name=name;
this.rollno=rollno;
this.marks=marks;

}
public void display(){
    System.out.println("Name: "+name);
    System.out.println("Rollno: "+rollno);
    System.out.println("Marks: "+marks);
}
}
public class Student{
public static void main(String[] args) {
    std s1=new std("Ram", 123, 90);
    std s2=new std("Shyam", 124, 99);
    s1.display();
    s2.display();

}}


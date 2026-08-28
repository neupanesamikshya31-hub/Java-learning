// Write a Java program to create a Student class with name and age as data members. 
// Use a parameterized constructor to initialize the values. Create an array of 3 Student objects and 
// display the information of all students.


class Student{
    String name;
    int age;

Student(String name, int age){
    this.name=name;
    this.age=age;
}
public void display(){
    System.out.println("name: "+name);
    System.out.println("age: "+age);
}
}
public class Main {
    public static void main(String[] args) {
       Student[] student=new Student[3];
       student[0] = new Student("Sam", 20);
       student[1] = new Student("Ram", 10);
       student[2] = new Student("Ram", 10);

       student[0].display();
       student[1].display();
       student[2].display();

    }
}

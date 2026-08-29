// Write a Java program to demonstrate inheritance and the use of the super keyword. Create a Person class with name and age, and a Student
//  class that inherits from Person and adds rollNo. Use super to initialize the parent class data.

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {
    int rollNo;

    Student(String name, int age, int rollNo) {
        super(name, age);
        this.rollNo = rollNo;
    }

    void displayStudent() {
        display();
        System.out.println("Roll No: " + rollNo);
    }
}

public class Inheritance {

    public static void main(String[] args) {

        Student s = new Student("Ram", 19, 101);

        s.displayStudent();
    }
}

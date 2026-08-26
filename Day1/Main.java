// Write a Java program to create a Student class with name, age,
// college, and address as data members. Use appropriate access modifiers
// for the data members. Define a parameterized constructor to initialize
// the student details and create a method to display the student's
// information. In the main() method, create a Student object and display
// its details along with a message indicating that the student is studying.

class Student {

    public String name;
    private int age;
    protected String college;
    String address;

    Student(String name, int age, String college, String address) {

        this.name = name;
        this.age = age;
        this.college = college;
        this.address = address;
    }

    public void studentinfo() {

        System.out.println("Student name: " + name);
        System.out.println("Age: " + age);
        System.out.println("College: " + college);
        System.out.println("Address: " + address);
    }

    public void study() {

        System.out.println(name + " is studying.");
    }
}

public class Main {

    public static void main(String[] args) {

        Student s1 = new Student(
            "Samikshya",
            20,
            "TCMIT",
            "Kapan"
        );

        s1.studentinfo();
        s1.study();
    }
}
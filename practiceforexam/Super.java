// Write a Java program where a Person class contains a name variable and a method to display it. Create a Student subclass that contains a 
// rollNumber and uses the super keyword to initialize and display the name inherited from the parent class.

class Person {

    String name;

    Person(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Name: " + name);
    }
}

class Student extends Person {

    int rollnumber;

    Student(String name, int rollnumber) {
        super(name);
        this.rollnumber = rollnumber;
    }

    public void display() {
        System.out.println("Name: " + super.name);
        System.out.println("Roll Number: " + rollnumber);
    }
}

public class Super {

    public static void main(String[] args) {

        Student st = new Student("Ram", 12);

        st.display();
    }
}
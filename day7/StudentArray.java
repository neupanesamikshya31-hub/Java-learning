// Write a Java program to create a Student class with name, rollNo, and marks. Use a parameterized constructor, create an array of 5 Student 
// objects, and display the details of all five students.

class Student{
    String name;
    int rollno;
    int marks;

    Student(String name, int rollno, int marks){
        this.name=name;
        this.rollno=rollno;
        this.marks=marks;
    }
    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Roll no: "+rollno);
        System.out.println("Marks: "+marks);
    }
}
public class StudentArray {
 public static void main(String[] args) {
Student[] std= new Student[5];
 std[0] = new Student("Ram", 123, 99);
        std[1] = new Student("Shyam", 124, 85);
        std[2] = new Student("Hari", 125, 78);
        std[3] = new Student("Sita", 126, 92);
        std[4] = new Student("Gita", 127, 88);

        std[0].display();
        System.out.println();

        std[1].display();
        System.out.println();

        std[2].display();
        System.out.println();

        std[3].display();
        System.out.println();

        std[4].display();
    }
}

// Write a Java program to create a class Student with name, rollNo, and marks as data members. Use appropriate visibility modifiers and
//  a parameterized constructor to initialize the data members. Define a method to display the student's information. Create a subclass Scholar 
//  that inherits from Student and overrides the display() method to display the student's information along with the message "Scholar Student".
//   Finally, create objects of both classes in the main() method and demonstrate inheritance and method overriding.

class Student{         
   private String name;
   private int rollNo;
   private  int marks;
Student(String name, int rollNo, int marks){
    this.name=name;
    this.rollNo=rollNo;
    this.marks=marks;
}
public void info(){
    System.out.println("Name: "+name);
    System.out.println("Roll no.: "+rollNo);
    System.out.println("Marks: "+marks);
}}

class Scholar extends Student{             //child class

    Scholar(String name, int rollNo, int marks){     //child constructor
         super(name, rollNo, marks);
    }
    @Override
    public void info(){    //override
        super.info();
    System.out.println("Scholar Student");

}
}
public class revision {
    public static void main(String[] args) {
Student s=new Student("Ram", 12, 99);
Scholar sc=new Scholar("Sita", 15, 95);
s.info();
System.out.println();
sc.info();
        
    }
}

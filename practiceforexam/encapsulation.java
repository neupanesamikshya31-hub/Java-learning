// Write a Java program to create a Student class that contains private data members for the student's name, roll number, and marks. 
// Use a parameterized constructor to initialize these values and appropriate getter methods to display the student's information.


class Student{
    private String name;
    private int rollnumber;
private int marks;

Student(String name, int rollnumber, int marks){
    this.name=name;
    this.rollnumber=rollnumber;
    this.marks=marks;
}
public void setname(String name){
this.name=name;
}
public String getname(){
    return name;
}
public void setrollnumber(int rollnumber){
    this.rollnumber=rollnumber;
}
public int getrollnumber(){
    return rollnumber;
}
public void setmarks(int marks){
    this.marks=marks;
}
public int getmarks(){
    return marks;
}

}



public class encapsulation {
    public static void main(String[] args) {
        Student s=new Student("Ram", 234, 90);
        s.setname("Shyam");
        System.out.println(s.getname());
        s.setrollnumber(123);
        System.out.println(s.getrollnumber());
        s.setmarks(99);
        System.out.println(s.getmarks());
    }
}

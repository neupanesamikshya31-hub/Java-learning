// Write a Java program to create a Book class with title, author, and price as data members. Use a parameterized constructor to initialize
//  the values and create an array of three Book objects. Display the details of all three books using a method.

class Book{
    String title;
    String author;
    int price;

Book(String title, String author, int price){
    this.title=title;
    this.author=author;
    this.price=price;
}
public void display(){
    System.out.println("Title: "+title);
    System.out.println("Author: "+author);
    System.out.println("Price: "+price);
}
}
public class array{
    public static void main(String[] args) {
        Book[] bk=new Book[3];
bk[0]=new Book("java","James",900);
bk[1] = new Book("Python", "Guido", 600);
bk[2] = new Book("C++", "Bjarne", 700);
bk[0].display();
bk[1].display();
bk[2].display();
    }
}
// Write a Java program to create a Book class with title, author, price, and publisher as data members. Use appropriate access modifiers for the
// data members. Define a parameterized constructor to initialize the book details and create a method to display the book's information. Also 
// create a method to display a message indicating that the book is being read. In the main() method, create a Book object and display its details 
// along with the reading message.

class Books{
    public String title;
    String author;
    private double price;
    protected String publisher;

Books(String title, String author, double price, String publisher){
    this.title=title;
    this.author=author;
    this.price=price;
    this.publisher=publisher;
}
public void Bookinfo(){
    System.out.println("Title: "+title);
    System.out.println("Author: "+author);
    System.out.println("Price: "+price);
    System.out.println("Publisher: "+publisher);
}
public void bookmessage(){
    System.out.println("Book is reading");
}
}

public class Book {
    public static void main(String[] args) {
        Books b1=new Books(
            "Java Programming",
            "James Gosling",
            1500,
            " Tech Books"
        );
        b1.Bookinfo();
        b1.bookmessage();
    }}
    
    


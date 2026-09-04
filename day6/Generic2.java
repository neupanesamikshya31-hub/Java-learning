// Write a Java program to create a generic method display() that can accept and display values of different data types, and demonstrate 
// the method by passing a String, an Integer, and a Double value.

class Generic2 {

    static <T> void display(T value) {
        System.out.println(value);
    }

    public static void main(String[] args) {

        display("Hello");
        display(100);
        display(25.5);
    }
}

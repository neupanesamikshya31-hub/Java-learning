// Write a Java program to create a custom exception named InvalidAgeException. Create a method that accepts an integer age as a parameter.
//  If the age is less than 18, throw the custom exception; otherwise, display "Person is eligible". Handle the custom exception using a try-catch 
//  block in the main() method.


class InvalidAgeException extends Exception {

    InvalidAgeException(String msg) {
        super(msg);
    }
}

public class Custom {

    static void checkAge(int age) throws InvalidAgeException {

        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above");
        } else {
            System.out.println("Person is eligible");
        }
    }

    public static void main(String[] args) {

        int age = 16;

        try {
            checkAge(age);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
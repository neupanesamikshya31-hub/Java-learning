// Write a Java program that accepts two integers from the user and performs division. Use try-catch-finally to handle the situation when
//  the second number is zero, and ensure that a message indicating the completion of the program is displayed using the finally block.

import java.util.Scanner;

public class exception {
 public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     try {
         System.out.println("Enter first number: ");
         int num=sc.nextInt();

         System.out.println("Enter second number: ");
         int num1=sc.nextInt();

         if(num1==0){
            System.out.println("Number cannot divide by 0");
         }
         else{
         System.out.println("Divide result: "+(num/num1));
         }
     } catch (ArithmeticException e) {
         System.out.println("Arithmetic error occurred");
     }
     finally{
        System.out.println("Program finished");
     }
 }   
}

// Write a Java program to demonstrate compile-time polymorphism using method overloading by creating two add() methods, 
// one to add two integers and another to add three integers, and display the results.


class Add{
    public int add(int a , int b){
return a+b;
    }

        public int add(int a, int b, int c){
            return a+b+c;
        }
    }


public class Poly {
    public static void main(String[] args){
        Add a=new Add();
        System.out.println(a.add(1, 2));
        System.out.println(a.add(1, 2, 3));
    }
}

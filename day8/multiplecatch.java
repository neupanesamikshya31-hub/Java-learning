
public class multiplecatch {
public static void main(String[] args) {
    
    try {
        int a=10;
        int b=0;
        int result=a/b;
        System.out.println(result);

        int[] marks={10,20,30};
        System.out.println(marks[7]);
    } 
    catch (ArithmeticException e) {
        System.out.println("Number cannot divide by zero");
    }
    catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Invalid");
    }
    finally{
        System.out.println("End of the program");
    }
}    
}

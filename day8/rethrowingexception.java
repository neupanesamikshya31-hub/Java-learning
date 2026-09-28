
public class rethrowingexception {
   static void divide(){
    try {
        int a=10;
        int b=0;
        int result=a/b;
        System.out.println(result);
    } 
    catch (ArithmeticException e) {
        System.out.println("Error");
        throw e;
    }

   }
   public static void main(String[] args) {
       try {
           divide();
       } catch (ArithmeticException e) {
        System.out.println("Number cannot divide by 0");
       }
       finally{
        System.out.println("Program ends");
       }
   } 
}

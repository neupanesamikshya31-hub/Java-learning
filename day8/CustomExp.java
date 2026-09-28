

class LowMarksException extends Exception{
    LowMarksException(String message){
    super(message);
}
}
public class CustomExp {
 public static void main(String[] args) {
     int marks=30;
     try {
         if(marks<40){
            throw new LowMarksException("Student has failed");

         }
         System.out.println("Student has passed");
     } catch (LowMarksException e) {
        System.out.println(e.getMessage());
     }
 }   
}

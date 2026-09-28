class AgeLimitException extends Exception{
    AgeLimitException(String str){
    super(str);
}
}
public class customexception {
    public static void main(String[] args) {
        int a=15;
        try {
            if (a<18){
                throw new AgeLimitException("Age is less than 18");

            }
            System.out.println("You can vote");
        } 
        catch (AgeLimitException e) {
            System.out.println(e.getmessage());
        }
    }
}

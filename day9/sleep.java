class MyThread extends Thread{
    public void run(){
        System.out.println("Hello");
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
        }
        System.out.println("Bye");
    }
 }
public class sleep {
    public static void main(String[] args) {
        MyThread t=new MyThread();
        t.start();
    }
}

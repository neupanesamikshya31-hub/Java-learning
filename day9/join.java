class MyThread extends Thread{
    public void run(){
        System.out.println("THread is running");
    }
}
public class join {
    public static void main(String[] args) {
        MyThread t =new MyThread();
        t.start();
    try {
        t.join();
    } catch (Exception e) {
    }
    System.out.println("Main thread finished");
    }
}

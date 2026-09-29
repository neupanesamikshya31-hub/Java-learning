// Write a Java program by implementing the Runnable interface to create a thread. The thread should print "Task Started", pause execution for 
// 2 seconds using sleep(), and then print "Task Completed". In the main() method, start the thread and use join() so that the main thread waits
//  for the created thread to finish.

 class MyThread implements Runnable {

    public void run() {
        System.out.println("Task Started");

        try {
            Thread.sleep(2000);
        } catch (Exception e) {
        }

        System.out.println("Task Completed");
    }
}

public class Multithreading {

    public static void main(String[] args) {

        MyThread task = new MyThread();
        Thread t = new Thread(task);

        t.start();

        try {
            t.join();
        } catch (Exception e) {
        }

        System.out.println("Main thread is finished");
    }
}

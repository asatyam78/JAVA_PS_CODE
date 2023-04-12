package Multithreading;

// Program to interrupt a thread

public class InterruptThread {
  public static void main(String[] args) {
    Thread thread = new MyThread("1");
    thread.start();
    try {
      Thread.sleep(3500);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    thread.interrupt();
  }
}

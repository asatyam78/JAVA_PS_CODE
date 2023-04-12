package Multithreading;

//Create Thread using Thread class.

public class ThreadImpl {
  public static void main(String[] args) {
    Thread t1 = new MyThread("1");
    Thread t2 = new MyThread("2");
    System.out.println("Starting both threads");
    t1.start();
    t2.start();
  }
}
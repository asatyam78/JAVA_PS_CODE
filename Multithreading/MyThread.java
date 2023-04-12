package Multithreading;

public class MyThread extends Thread{
  String name;
  public MyThread(String name) {
    this.name = name;
  }
  @Override
  public void run() {
    System.out.println("Thread started " + this.name);

    try {
      for(int i = 0; i < 5; i++) {
        System.out.println(Thread.currentThread().getName() + "-->" + i);
        Thread.sleep(1000);
      }
    } catch (InterruptedException e) {
      System.err.println("Interrupted Exception");
    }

    System.out.println("Thread end " + this.name);
  }
}

package Multithreading;

import java.util.concurrent.Semaphore;

public class SemaphoresImpl {
  static int num = 5;

  public static void main(String[] args) {
    Semaphore sem = new Semaphore(1);

    NewThread t1 = new NewThread(sem, "1");
    NewThread t2 = new NewThread(sem, "2");

    t1.start();
    t2.start();
  }
}

class NewThread extends Thread {
  Semaphore sem;
  String threadName;

  public NewThread(Semaphore sem, String threadName) {
    super(threadName);
    this.sem = sem;
    this.threadName = threadName;
  }

  @Override
  public void run() {
    System.out.println("Starting " + threadName);
    System.out.println(threadName + " is waiting for a permit.");
    try {
      System.out.println(threadName + " is waiting for a permit.");
      sem.acquire();
      System.out.println(threadName + " gets a permit.");
      System.out.println(SemaphoresImpl.num++);

    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println(threadName + " releases the permit.");
    sem.release();
  }
}
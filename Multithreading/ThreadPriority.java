package Multithreading;

public class ThreadPriority {
  public static void main(String[] args) {
    Thread t1 = new MyThread("1");
    Thread t2 = new MyThread("2");
    Thread t3 = new MyThread("3");

    System.out.println("t1 thread priority --> " + t1.getPriority());
    System.out.println("t2 thread priority --> " + t2.getPriority());
    System.out.println("t3 thread priority --> " + t3.getPriority());

    t1.setPriority(3);
    t2.setPriority(6);
    t3.setPriority(9);

    System.out.println("t1 thread priority --> " + t1.getPriority());
    System.out.println("t2 thread priority --> " + t2.getPriority());
    System.out.println("t3 thread priority --> " + t3.getPriority());
  }
}

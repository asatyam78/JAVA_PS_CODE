package Multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Task {
  public static void main(String[] args) { 
    ExecutorService executorService = Executors.newFixedThreadPool(2); 
    executorService.submit(new RunnableTask()); 
    Future<String> futureTask = executorService.submit(new CallableTask()); 
    try { 
      System.out.println(futureTask.get()); 
    } catch (Exception e) { 
      e.printStackTrace(); 
    } 
    executorService.shutdown(); 
  }  
}

class RunnableTask implements Runnable {
  @Override
  public void run() {
    System.out.println("Task using runnable");
  }
}
  
class CallableTask implements Callable<String> {
  @Override
  public String call() {
    return "Task using callable";
  }
}
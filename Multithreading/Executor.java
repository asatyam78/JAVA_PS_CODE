package Multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class Executor {
  public static void main(String[] args) {
    ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
    singleThreadExecutor.execute(new MyThread("1"));
    singleThreadExecutor.execute(new MyThread("2"));
    singleThreadExecutor.shutdown();

    // ExecutorService fixedThreadPool = Executors.newFixedThreadPool(2);
    // fixedThreadPool.execute(new MyThread("1"));
    // fixedThreadPool.execute(new MyThread("2"));
    // fixedThreadPool.execute(new MyThread("3"));
    // fixedThreadPool.shutdown();

    // ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
    // cachedThreadPool.execute(new MyThread("1"));
    // cachedThreadPool.execute(new MyThread("2"));
    // cachedThreadPool.execute(new MyThread("3"));
    // cachedThreadPool.shutdown();

    // ScheduledExecutorService scheduledThreadPool =
    // Executors.newScheduledThreadPool(2);
    // ScheduledFuture<?> scheduledFuture = scheduledThreadPool.schedule(new
    // MyThread("1"), 5, TimeUnit.SECONDS);

    // try {
    // System.out.print("Schedule future");
    // scheduledFuture.get();
    // } catch (Exception e) {
    // e.printStackTrace();
    // }
    // scheduledThreadPool.shutdown();
  }
}

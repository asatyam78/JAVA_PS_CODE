package CompletableFuture;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

// Write a fork and join program to sum all the numbers from a range.- RecursiveTask

public class SumOfRangeOfNumbers extends RecursiveTask<Integer> {
  private final int start;
  private final int end;

  public SumOfRangeOfNumbers(int start, int end) {
    this.start = start;
    this.end = end;
  }

  @Override
  protected Integer compute() {
    if (end - start <= 2) {
      int sum = 0;
      for (int i = start; i <= end; i++) {
        sum += i;
      }
      return sum;
    } else {
      int mid = (start + end) / 2;
      SumOfRangeOfNumbers leftTask = new SumOfRangeOfNumbers(start, mid);
      SumOfRangeOfNumbers rightTask = new SumOfRangeOfNumbers(mid + 1, end);
      leftTask.fork();
      rightTask.fork();
      return leftTask.compute() + rightTask.compute();
    }
  }

  public static void main(String[] args) {
    int start = 0;
    int end = 23;
    ForkJoinPool pool = new ForkJoinPool();
    SumOfRangeOfNumbers task = new SumOfRangeOfNumbers(start, end);
    long result = pool.invoke(task);
    System.out.println("Sum of " + start + " to " + end + " is " + result);
  }
}

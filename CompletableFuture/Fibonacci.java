package CompletableFuture;

import java.util.concurrent.RecursiveAction;

public class Fibonacci extends RecursiveAction {
  private final int n;
  private int result;

  public Fibonacci(int n) {
    this.n = n;
  }

  public int getResult() {
    return result;
  }

  @Override
  protected void compute() {
    if (n <= 1) {
      result = n;
    } else {
      Fibonacci fibNMinus1 = new Fibonacci(n - 1);
      Fibonacci fibNMinus2 = new Fibonacci(n - 2);
      fibNMinus1.fork();
      fibNMinus2.compute();
      fibNMinus1.join();
      result = fibNMinus1.getResult() + fibNMinus2.getResult();
    }
  }

  public static void main(String[] args) {
    int n = 5;
    Fibonacci fib = new Fibonacci(n);
    fib.invoke();
    System.out.println(fib.getResult());
  }
}

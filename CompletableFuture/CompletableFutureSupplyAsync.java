package CompletableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureSupplyAsync {
  public static void main(String[] args) throws InterruptedException, ExecutionException {
    CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
      return "Completable future result";
    });
    for (int i = 0; i < 5; i++) {
      System.out.println(i);
    }
    System.out.println(future.get());
  }
}

package CompletableFuture;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureRunAsync {
  public static void main(String[] args) {
    CompletableFuture.runAsync(() -> {
      for (int i = 0; i < 5; i++) {
        System.out.println("from async " + i);
      }
    });

    for (int i = 0; i < 5; i++) {
      System.out.println("from main " + i);
    }
  }
}

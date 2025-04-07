package CompletableFuture;

import java.util.concurrent.CompletableFuture;

public class RunAsync {
    public static void main(String[] args) {
        CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
            System.out.println("Task running in: " + Thread.currentThread().getName());
        });

        // Make sure the program doesn't exit immediately
        future.join();  // Blocks until completion (alternative to .get())
    }
}

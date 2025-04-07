package CompletableFuture;

import java.util.concurrent.CompletableFuture;

public class SupplyAsync {
    public static void main(String[] args) {
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            System.out.println("Fetching data in: " + Thread.currentThread().getName());
            return "Hello, CompletableFuture!";
        });

        // Get the result
        String result = future.join(); // Alternative: future.get()
        System.out.println("Result: " + result);
    }
}

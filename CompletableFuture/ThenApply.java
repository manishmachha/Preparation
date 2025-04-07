package CompletableFuture;

import java.util.concurrent.CompletableFuture;

public class ThenApply {
    public static void main(String[] args) {
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            return "Hello";
        }).thenApply(greeting -> {
            return greeting + ", World!";
        });

        System.out.println(future.join()); // Output: Hello, World!
    }
}

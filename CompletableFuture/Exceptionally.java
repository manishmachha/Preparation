package CompletableFuture;

import java.util.concurrent.CompletableFuture;

public class Exceptionally {
    public static void main(String[] args) {
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            if (true) {
                throw new RuntimeException("Something went wrong!");
            }
            return "Success!";
        }).exceptionally(ex -> {
            System.out.println("Error: " + ex.getMessage());
            return "Default Value";
        });

        System.out.println(future.join()); // Output: Default Value
    }
}

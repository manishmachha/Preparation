package CompletableFuture;

import java.util.concurrent.CompletableFuture;

public class ThenAccept {
    public static void main(String[] args) {
        CompletableFuture.supplyAsync(() -> "Hello, CompletableFuture!")
                .thenAccept(System.out::println); // Just prints the result

        // Ensure the program waits before exiting
        sleep(1);
    }

    static void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

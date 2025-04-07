package CompletableFuture;

import java.util.concurrent.CompletableFuture;

public class AllOf {
    public static void main(String[] args) {
        // Creating multiple async tasks
        CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> {
            sleep(2); // Simulating delay
            return "Task 1 completed";
        });

        CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> {
            sleep(1);
            return "Task 2 completed";
        });

        CompletableFuture<String> future3 = CompletableFuture.supplyAsync(() -> {
            sleep(3);
            return "Task 3 completed";
        });

        // Using allOf to wait for all tasks
        CompletableFuture<Void> allFutures = CompletableFuture.allOf(future1, future2, future3);

        // Wait until all tasks are done
        allFutures.join();

        // Manually retrieve results
        System.out.println(future1.join());
        System.out.println(future2.join());
        System.out.println(future3.join());
    }

    static void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

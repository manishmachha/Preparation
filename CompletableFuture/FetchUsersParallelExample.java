import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FetchUsersParallelExample {
    public static void main(String[] args) {
        List<Integer> userIds = List.of(1, 2, 3, 4, 5); // Sample user IDs

        System.out.println("Fetching users in parallel...");
        CompletableFuture<List<String>> usersFuture = fetchUsers(userIds);
        List<String> users = usersFuture.join();
        // Get and print the final list of users
        System.out.println("Users: " + users);
    }

    static CompletableFuture<List<String>> fetchUsers(List<Integer> userIds) {
        // Create a CompletableFuture for each user fetch operation
        List<CompletableFuture<String>> userFutures = userIds.stream()
                .map(FetchUsersParallelExample::findById) // Fetch each user asynchronously
                .collect(Collectors.toList());

        // Combine all futures and return a list of user details
        return CompletableFuture.allOf(userFutures.toArray(new CompletableFuture[0]))
                .thenApply(v -> userFutures.stream()
                        .map(CompletableFuture::join) // Collect results
                        .collect(Collectors.toList()));
    }

    static CompletableFuture<String> findById(int userId) {
        return CompletableFuture.supplyAsync(() -> {
            sleep(0); // Simulating API delay
            return "User-" + userId; // Simulated user data
        });
    }

    static void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

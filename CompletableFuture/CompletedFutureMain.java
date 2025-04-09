import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;

public class CompletedFutureMain {
    public static void main(String[] args) {
        System.out.println(sayHi("Manish").join());
    }

    public static CompletableFuture<String> sayHi(String name) {
        return CompletableFuture.completedFuture("Hi " + name);
    }
}

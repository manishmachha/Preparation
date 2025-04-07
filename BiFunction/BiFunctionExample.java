package BiFunction;

import java.util.function.BiFunction;

public class BiFunctionExample {
    public static void main(String[] args) {
        // BiFunction takes two Integers and returns their sum
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;

        // Calling apply method to execute the function
        int result = add.apply(10, 20);

        System.out.println("Sum: " + result); // Output: Sum: 30
    }
}

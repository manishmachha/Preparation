package BiFunction;

import java.util.function.BiFunction;

public class StringConcatExample {
    public static void main(String[] args) {
        BiFunction<String, String, String> concat = (s1, s2) -> s1 + " " + s2;

        String fullName = concat.apply("John", "Doe");

        System.out.println(fullName); // Output: John Doe
    }
}
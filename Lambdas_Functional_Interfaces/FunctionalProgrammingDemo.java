package Lambdas_Functional_Interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FunctionalProgrammingDemo {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Jane", "Jack", "Jill", "Jerry", "Jenny");

        // Filter names starting with 'J' and convert to uppercase
        List<String> filteredNames = names.stream()
                .filter(name -> name.startsWith("J")) // Pure function
                .map(String::toUpperCase) // Pure function
                .collect(Collectors.toList()); // Collect the result

        // Print the result
        filteredNames.forEach(System.out::println);
    }
}

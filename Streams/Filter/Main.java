package Streams.Filter;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> evenNummbers = numbers.stream().filter(n -> n % 2 == 0).toList();
        System.out.println(evenNummbers);
    }

}

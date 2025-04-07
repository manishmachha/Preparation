package Streams.Map;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> squaredNumbers = numbers.stream().map(n -> n * n).toList();
        System.out.println(squaredNumbers);
    }
}

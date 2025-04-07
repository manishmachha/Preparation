package Streams.Reduce;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int sum = numbers.stream().reduce(0, (num1, num2) -> num1 + num2);
        System.out.println(sum);
    }
}

package Lambdas_Functional_Interfaces.Function_Interfcae;

import java.util.function.Function;

class MathUtil {
    static int square(int num) {
        return num * num;
    }
}

public class Main {
    public static void main(String[] args) {
        // The Function interface takes one argument and returns a result.
        Function<String, Integer> length = x -> x.length();
        System.out.println("Length of Hello is: " + length.apply("Hello"));

        Function<Integer, Boolean> isEven = x -> x % 2 == 0;
        System.out.println("10 is even : " + isEven.apply(10));

        // Using method reference to call the static method
        Function<Integer, Integer> squareFunc = MathUtil::square;
        System.out.println(squareFunc.apply(5));
    }
}

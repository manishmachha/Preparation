package Lambdas_Functional_Interfaces.Predicate_Interface;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        /*
         * The Predicate interface represents a boolean-valued function of one argument.
         * This is a functional interface whose functional method is test(Object).
         */
        Predicate<String> isPalindrome = (string) -> string.equals(new StringBuilder(string).reverse().toString());
        System.out.println("mom is palindrome : " + isPalindrome.test("mom"));
    }
}

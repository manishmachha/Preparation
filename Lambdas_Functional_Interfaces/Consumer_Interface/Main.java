package Lambdas_Functional_Interfaces.Consumer_Interface;

import java.util.function.Consumer;

class Printer {
    void print(String message) {
        System.out.println(message);
    }

    static void hello(String name) {
        System.out.println("Hello, " + name);
    }
}

public class Main {
    public static void main(String[] args) {
        /*
         * The Consumer interface represents an operation that accepts a single input
         * argument and returns no result.
         */
        Consumer<String> printConsumer = (s) -> System.out.println("Hello " + s);
        printConsumer.accept("Manish");

        // Using method reference to call the instance method
        Consumer<String> printerFunc = new Printer()::print;
        printerFunc.accept("Hello, World!"); // Output: Hello, World!

        // Using method reference to call the static method
        Consumer<String> helloFunc = Printer::hello;
        helloFunc.accept("Manish"); // Output: Hello, World
    }
}

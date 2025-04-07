package Lambdas_Functional_Interfaces.FunctionalInterface;

interface Hello {
    void Greet(String name);
}

public class Main {
    public static void main(String[] args) {
        Hello hello = (name) -> System.out.println("Hello " + name);
        hello.Greet("John");
    }
}

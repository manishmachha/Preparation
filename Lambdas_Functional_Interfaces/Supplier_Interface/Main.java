package Lambdas_Functional_Interfaces.Supplier_Interface;

import java.util.function.Supplier;

class Person {
    String name;

    void greet(String name) {
        this.name = name;
        System.out.println("Hello from " + name);
    }
}

public class Main {
    public static void main(String[] args) {
        /*
         * It represents a supplier of results and does not take any input but returns a
         * result. It is often used in scenarios where you need to generate or supply an
         * object or value.
         */
        Supplier<Person> personSupplier = Person::new;
        Person person = personSupplier.get();
        person.greet("Manish");

    }
}

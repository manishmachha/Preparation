package Abstraction;

abstract class Animal {
    abstract void sound();
}

class Dog extends Animal {
    void sound() {
        System.out.println("The dog barks.");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("The cat meows.");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myDog.sound(); // Outputs: The dog barks.
        myCat.sound(); // Outputs: The cat meows.
    }
}
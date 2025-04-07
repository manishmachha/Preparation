// Base class
class Animal {
    String name;
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Derived class
class Dog extends Animal {
    int age;
    Dog() {
        super(); // Calls the constructor of Animal
    }
    Dog(String name, int age) {
        super(name);
        this.age = age; 
    }
    void bark() {
        System.out.println("The dog barks.");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Honey",5);
        dog.eat(); // Inherited method
        dog.bark(); // Own method
        Dog dog1 = new Dog();
        System.out.println(dog.hashCode());
        System.out.println(dog1.hashCode());
    }
}
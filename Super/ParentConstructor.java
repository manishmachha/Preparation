package Super;

class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }
}

class Dog extends Animal {
    int age;

    Dog(String name, int age) {
        super(name); // Calls the constructor of the parent class (Animal)
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class ParentConstructor {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", 3);
        dog.display();
    }
}

package Super;

class Animal1 {
    String name = "Animal";

    void display() {
        System.out.println("I am an " + name);
    }
}

class Dog1 extends Animal1 {
    String name = "Dog";

    void display() {
        super.display(); // Calls the method of the parent class (Animal)
        System.out.println("I am a " + name);
    }
}

public class ParentProperty {
    public static void main(String[] args) {
        Dog1 dog = new Dog1();
        dog.display();
    }
}

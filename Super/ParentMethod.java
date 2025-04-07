package Super;

class Animal2 {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog2 extends Animal2 {
    @Override
    void sound() {
        super.sound(); // Calls the method of the parent class (Animal)
        System.out.println("Dog barks");
    }
}

public class ParentMethod {
    public static void main(String[] args) {
        Dog2 dog = new Dog2();
        dog.sound();
    }
}

package DefaultMethod;

interface MyInterface {
    // Abstract method
    void existingMethod(String str);

    // Default method
    default void newDefaultMethod() {
        System.out.println("New default method");
    }
}

class MyClass implements MyInterface {
    public void existingMethod(String str) {
        System.out.println("Existing method: " + str);
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.existingMethod("Hello");
        obj.newDefaultMethod(); // Calling the default method
    }
}

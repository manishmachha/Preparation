package Exceptions;

class Resource1 implements AutoCloseable {
    @Override
    public void close() {
        System.out.println("Resource1 closed.");
    }
}

class Resource2 implements AutoCloseable {
    @Override
    public void close() {
        System.out.println("Resource2 closed.");
    }
}

/*
 * The try-with-resources statement automatically closes any resource that
 * implements the AutoCloseable interface (which includes java.io.Closeable,
 * used for classes like FileReader, BufferedReader, FileOutputStream, etc.).
 * This helps avoid potential memory leaks that might occur when resources are
 * manually closed.
 */
public class MultipleCustomResourcesExample {
    public static void main(String[] args) {
        try (
                Resource1 res1 = new Resource1();
                Resource2 res2 = new Resource2()) {
            System.out.println("Using resources.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

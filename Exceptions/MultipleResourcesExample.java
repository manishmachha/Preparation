package Exceptions;

import java.io.*;

/*
 * The try-with-resources statement automatically closes any resource that
 * implements the AutoCloseable interface (which includes java.io.Closeable,
 * used for classes like FileReader, BufferedReader, FileOutputStream, etc.).
 * This helps avoid potential memory leaks that might occur when resources are
 * manually closed.
 */
public class MultipleResourcesExample {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new FileReader("example.txt"));
                PrintWriter writer = new PrintWriter(new FileWriter("output.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                writer.println(line); // Write the line to output.txt
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

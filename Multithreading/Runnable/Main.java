package Multithreading.Runnable;

// Using the Runnable interface
class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Runnable is running.");
    }
}

public class Main {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable());
        thread.start(); // Starts the thread
    }
}
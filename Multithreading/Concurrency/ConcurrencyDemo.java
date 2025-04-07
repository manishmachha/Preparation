package Multithreading.Concurrency;

public class ConcurrencyDemo {
    public static void main(String[] args) {
        // Creating multiple threads
        Thread thread1 = new Thread(new Task("Task 1"));
        Thread thread2 = new Thread(new Task("Task 2"));

        // Starting the threads
        thread1.start();
        thread2.start();
    }
}

class Task implements Runnable {
    private String name;

    public Task(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(name + " - " + i);
        }
    }
}

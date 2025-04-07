package StackOverFlowError;

public class StackOverflowErrorDemo {

    static int i = 0;
    public static void recursiveMethod() {
        // No base case or termination condition, leading to infinite recursion
        System.out.println("Recursive method called: " + i++);
        recursiveMethod();
    }

    public static void main(String[] args) {
        try {
            recursiveMethod();
        } catch (StackOverflowError e) {
            System.out.println("StackOverflowError occurred!");
        }
    }
}

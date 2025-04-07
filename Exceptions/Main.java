package Exceptions;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class Main {
    public static boolean validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("InvalidAgeException: Underage");
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        try {
            validateAge(15);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}

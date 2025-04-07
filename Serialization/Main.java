package Serialization;

import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;

// Class implementing Serializable interface
class Employee implements Serializable {
    private static final long serialVersionUID = 1L; // Recommended for Serializable classes
    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", id=" + id + "]";
    }
}

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("John Doe", 12345);

        // Serialization
        try (FileOutputStream fileOut = new FileOutputStream("employee.ser");
                ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(emp);
            System.out.println("Serialized data is saved in employee.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }

        // Deserialization
        Employee deserializedEmp = null;
        try (FileInputStream fileIn = new FileInputStream("employee.ser");
                ObjectInputStream in = new ObjectInputStream(fileIn)) {
            deserializedEmp = (Employee) in.readObject();
        } catch (IOException | ClassNotFoundException i) {
            i.printStackTrace();
        }

        System.out.println("Deserialized Employee:");
        System.out.println(deserializedEmp);
    }
}

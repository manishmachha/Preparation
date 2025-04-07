package BiFunction;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

class Employee {
    String name;
    double salary;
    int rating; // Performance rating out of 10

    Employee(String name, double salary, int rating) {
        this.name = name;
        this.salary = salary;
        this.rating = rating;
    }
}

public class EmployeeSalaryUpdate {
    public static void main(String[] args) {
        // List of employees
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", 50000, 9),
                new Employee("Bob", 40000, 7),
                new Employee("Charlie", 60000, 10));

        // BiFunction to calculate final salary with bonus
        BiFunction<Double, Integer, Double> calculateFinalSalary = (salary, rating) -> {
            double bonusPercentage = rating > 8 ? 20 : 10; // High rating gets 20%, else 10%
            return salary + (salary * bonusPercentage / 100);
        };

        // Using Streams to process the list
        employees.forEach(emp -> {
            double finalSalary = calculateFinalSalary.apply(emp.salary, emp.rating);
            System.out.println(emp.name + "'s Final Salary: " + finalSalary);
        });
    }
}

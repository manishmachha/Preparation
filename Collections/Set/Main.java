package Collections.Set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Apple"); // Duplicate element, will not be added

        for (String fruit : set) {
            System.out.println(fruit);
        }

        System.out.println("-----------------");

        Set<String> set2 = new TreeSet<>(Set.of("BMW", "Audi", "Mercedes"));
        set2.addAll(set);
        String[] fruits = new String[set2.size()];
        fruits = set2.toArray(fruits);
        set2.addAll(Set.of(fruits));
        for (String car : set2) {
            System.out.println(car);
        }
    }
}
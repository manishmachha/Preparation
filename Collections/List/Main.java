package Collections.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Apple"); // Duplicate element

        for (String fruit : list) {
            System.out.println(fruit);
        }
System.out.println("-----------------");
        List<String> list2 = new ArrayList<>(List.of("BMW", "Audi", "Mercedes"));
        String[] cars = new String[list2.size()];
        cars = list2.toArray(cars);
        list2.addAll(Arrays.asList(cars));
        for (String car : list2) {
            System.out.println(car);
        }
                Set<String> set2 = new TreeSet<>(Set.of("BMW", "Audi", "Mercedes"));
list2.addAll(set2);
        for (String car : list2) {
            System.out.println(car);
        }
    }
}
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorMain {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(3, "Aman"));
        list.add(new Student(1, "Ravi"));
        list.add(new Student(2, "Neha"));

        // list.sort(new IdComparator());
        Collections.sort(list, new IdComparator());

        System.out.println(list);
    }
}

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return id + " " + name;
    }
}

class NameComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);
    }
}

class IdComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s1.id - s2.id;
    }
}
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableMain {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(3, "Aman"));
        list.add(new Student(1, "Ravi"));
        list.add(new Student(2, "Neha"));

        Collections.sort(list);

        System.out.println(list);
    }
}

class Student implements Comparable<Student> {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Student s) {
        return this.id - s.id;
    }

    @Override
    public String toString() {
        return id + " " + name;
    }
}
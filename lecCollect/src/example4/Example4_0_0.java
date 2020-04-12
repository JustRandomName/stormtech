package example4;

import example4.object.Student;
import example4.object.StudentSort;

import java.util.ArrayList;
import java.util.Collections;

public class Example4_0_0 {
    public static void main(String[] args) {
        ArrayList<Student> ar = new ArrayList<Student>();
        ar.add(new Student(111, "Stepan", 8));
        ar.add(new Student(131, "Marina", 9));
        ar.add(new Student(121, "Nikita", 7));

        System.out.println("Unsorted");
        for (int i = 0; i < ar.size(); i++) {
            System.out.println(ar.get(i).getName() + "  " + ar.get(i).getAverage());
        }

        Collections.sort(ar, new StudentSort());

        System.out.println("\nSorted by average");
        for (int i = 0; i < ar.size(); i++) {
            System.out.println(ar.get(i).getName() + "  " + ar.get(i).getAverage());
        }
    }

}

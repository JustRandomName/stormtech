package example4;

import example4.object.Person;

import java.util.TreeSet;

public class Example4_1 {

    public static void main(String[] args) {
        TreeSet<Person> set = new TreeSet<>();

        set.add(new Person( 1, "Stepan", 45));
        set.add(new Person( 1, "Stepan", 35));
        set.add(new Person( 1, "Anton", 16));
        set.add(new Person( 1, "Nikita", 21));

        for (Person person : set) {
            System.out.println(person.getName() + "  " + person.getAge());
        }
    }
}

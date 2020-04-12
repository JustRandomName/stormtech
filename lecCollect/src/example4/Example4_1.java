package example4;

import example4.object.Person;

import java.util.TreeSet;

public class Example4_1 {

    public static void main(String[] args) {
        TreeSet<Person> set = new TreeSet<>();

        set.add(new Person(1, "Stepan"));
        set.add(new Person(2, "Anton"));
        set.add(new Person(2, "Nikita"));

        for (Person person : set) {
            System.out.println(person.getName());
        }
    }
}

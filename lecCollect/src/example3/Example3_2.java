package example3;

import java.util.*;

public class Example3_2 {
    public static void main(String[] args) {
        System.out.println("Example 3_2");

        String firstObj = "First Obj";
        String secondObj = "Second Obj";
        String thirdObj = "Third Obj";
        String forthObj = "Forth Obj";
        String fifth = "fifth Obj";

        Set<String> set = new HashSet<>();
//        List<String> stringList = new LinkedList<>();

        ////Add element
        set.add(firstObj);
        System.out.println("Add: " + set);

        ////remove element
        set.remove(firstObj);
        System.out.println("Remove: " + set);

        ////clean collection
        set.add(firstObj);
        set.add(secondObj);
        set.add(thirdObj);
        set.add(forthObj);
        System.out.println("before clean: " + set);
        set.clear();
        System.out.println("after clean: " + set);

        ////contains

        set.add(firstObj);
        set.add(secondObj);
        set.add(thirdObj);
        set.add(forthObj);

        System.out.println("Is obj contains in collection: " + set.contains(firstObj));
        System.out.println("Is obj contains in collection: " + set.contains(fifth));

        ////size
        System.out.println("List size: " + set.size());


        ///iterator
        Iterator<String> iter = set.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }


    }

}

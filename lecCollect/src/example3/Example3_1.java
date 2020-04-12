package example3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Example3_1 {

    public static void main(String[] args) {
        System.out.println("Example 3_1");

        String firstObj = "First Obj";
        String secondObj = "Second Obj";
        String thirdObj = "Third Obj";
        String forthObj = "Forth Obj";
        String fifth = "fifth Obj";

        List<String> list = new ArrayList<>();
//        List<String> stringList = new LinkedList<>();

        ////Add element
        list.add(firstObj);
        System.out.println("Add: " + list);

        ////remove element
        list.remove(firstObj);
        System.out.println("Remove: " + list);

        ////clean collection
        list.add(firstObj);
        list.add(secondObj);
        list.add(thirdObj);
        list.add(forthObj);
        System.out.println("before clean: " + list);
        list.clear();
        System.out.println("after clean: " + list);

        ////contains

        list.add(firstObj);
        list.add(secondObj);
        list.add(thirdObj);
        list.add(forthObj);

        System.out.println("Is obj contains in collection: " + list.contains(firstObj));
        System.out.println("Is obj contains in collection: " + list.contains(fifth));

        ////size
        System.out.println("List size: " + list.size());


        ///iterator
        Iterator<String> iter = list.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }


    }

}

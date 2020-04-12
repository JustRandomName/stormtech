package example4;

import java.util.ArrayList;
import java.util.Collections;

public class Example4_0 {

    public static void main(String[] args) {
        // Create a list of strings
        ArrayList<String> al = new ArrayList<>();
        al.add("BBBBB");
        al.add("SSSSS");
        al.add("FFFFF");
        al.add("ZZZZ");
        al.add("AAAA");

        /* Collections.sort method is sorting the
        elements of ArrayList in ascending order. */
        Collections.sort(al);

        // Let us print the sorted list
        System.out.println("List after the use of" +
                " Collection.sort() :\n" + al);
    }
}

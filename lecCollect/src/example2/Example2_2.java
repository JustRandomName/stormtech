package example2;

import java.util.ArrayList;
import java.util.List;

public class Example2_2 {

    public static void main(String[] args) {
        System.out.println("Example 2_2");


        List<String> list = new ArrayList<>();
        list.add("First Obj");
        list.add("Second Obj");
        list.add("Third Obj");
        list.add("Forth Obj");
        list.add("fifth Obj");
        list.add("Six Obj");
        System.out.println(list);


        List<String> list2 = new ArrayList<>(list);

        System.out.println(list2);
    }
}

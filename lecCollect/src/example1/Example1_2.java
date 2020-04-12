package example1;

import java.util.Arrays;

public class Example1_2 {


    public static void main(String[] args) {



        System.out.println("Example 1_2");

        String[] array1 = new String[5];
        array1[0] = "First Obj";
        array1[1] = "Second Obj";
        array1[2] = "Third Obj";
        array1[3] = "Forth Obj";
        array1[4] = "fifth Obj";
        System.out.println(Arrays.toString(array1));

        String[] array2 = new String[6];

        System.arraycopy(array1, 0, array2, 0, 5);

        System.out.println(Arrays.toString(array2));

        array2[5] = "Six Obj";

        System.out.println(Arrays.toString(array2));

    }
}

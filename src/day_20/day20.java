package day_20;

import com.sun.tools.hat.internal.util.ArraySorter;
import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType;

import java.sql.Array;
import java.util.Arrays;

public class day20 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4};
        String[] names = {"ridvan, bahast, musab"};
        char[] letters = {'w', 'b', 'x', 'd', 'e'};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i] + " ");
        }

        System.out.println();
        Arrays.sort(numbers);
        Arrays.sort(names);
        Arrays.sort(letters);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i] + " ");

            System.out.println("\nUsing Arrays.sort method...");
            System.out.println(Arrays.toString(numbers));
            System.out.println(Arrays.toString(names));
            System.out.println(Arrays.toString(letters));

        }
    }
}

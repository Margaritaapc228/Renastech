package Day_14;

import java.util.Scanner;

public class C5StringDemo {

    public static void main(String[] args) {
        String s = "Tom";

        System.out.println("Enter a String");
        Scanner scan = new Scanner(System.in);
        String s2 = scan.next();

        System.out.println(s==s2);
        System.out.println(s.equals(s2));
        System.out.println(s == s2.intern());


    }
}

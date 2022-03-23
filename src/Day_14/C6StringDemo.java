package Day_14;

import java.util.Scanner;

public class C6StringDemo {

    public static void main(String[] args) {

        /*String s1 = "Drum";
        System.out.println(s1.indexOf('u'));*/


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = scan.nextLine();
        System.out.println("Enter the character to find index for:");
        char ch = scan.next().charAt(0);

        if (str.indexOf(ch) == 1)
            System.out.println("character "+ch+ " is not there!");
        else
        System.out.println("Index of " +ch +" is " + str.indexOf(ch));



    }
}

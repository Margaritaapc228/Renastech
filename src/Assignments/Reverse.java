package Assignments;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Reverse {

    public static Scanner ka = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter sentence to reverse it ");
        String str = ka.nextLine();
        System.out.println("Reverse sentence is");
        String ss=reverse(str);
        System.out.println(ss);


    }

    public static String reverse(String sentence) {
        String[] words = sentence.split(" ");
        String reverseString = " ";
        for (int i= words.length-1 ;1>0;i--)
        reverseString+=words[i] + " ";


    }


}

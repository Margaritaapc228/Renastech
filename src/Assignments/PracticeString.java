package Assignments;

import java.util.Scanner;

public class PracticeString {

    public static void main(String[] args) {

        System.out.println("Write 2 numbers");
        System.out.println("Number one:");
        Scanner number = new Scanner(System.in);
        int x = number.nextInt();
        System.out.println("Number two:");
        int y = number.nextInt();
        int z= x+y;

        System.out.println(x + "," + y + "," + z);


    }
}

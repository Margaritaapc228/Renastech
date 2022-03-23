package Day_13;

import java.util.Scanner;

public class C3StringDemo {

    public static void main(String[] args) {

        /*
        num:holds the original number
        copy:holds the copy of the original number
        reverse holds the reversed number
         */

        int num, reverse = 0, copy, last_digit;
        System.out.println("Enter any number");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        copy = num;
        while (num > 0) {
            // System.out.println(AN INTERATION)
            last_digit = num % 10;
            reverse = (reverse * 10) + last_digit;
            num = num / 10;
        }
        if (copy == reverse)
            System.out.println("Palindrome Number");
        else System.out.println("Not Palindrome Number");


    }
}


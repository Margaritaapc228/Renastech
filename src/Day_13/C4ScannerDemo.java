package Day_13;

import java.util.Scanner;

public class C4ScannerDemo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter an int number");

        //below if condition is true if the user does´t enter INT number
        while (!scan.hasNextInt()) {
            String str= scan.nextLine();
            System.out.println("Entered number is " + str);
            System.out.println("Enter a valid int number:");

        }

        System.out.println("Thanks for entering a valid INT number");
            int i = scan.nextInt();
            System.out.println("Entered number is " + i);
    }
}

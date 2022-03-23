package Day_14;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class C1Revision {

    public static void main(String[] args) {

        //Scanner: a referenced dta type
        //Scan: an object reference variable OR reference OR reference variable
        Scanner scan = new Scanner(System.in);
        //using the object reference of the Scanner class,
        //in built methods of scanner class can be called

        System.out.println("Enter a number:");
      /* if (scan.hasNextInt()){
           int value = scan.nextInt();
           System.out.println("Valid int number: " + value);
       }
       else {
           System.out.println("No entered is not a valid int");
       }*/


        //below loop makes that a valid int number is
        //entered  by the user
        while (!scan.hasNextInt()){
            System.out.println("Please enter a valid int number" );
            scan.nextLine();
        }


        //after making sure that the valid in umber is entered
        //that number is scanned by the nextInt method
        int value = scan.nextInt();
        System.out.println("Entered int value is " + value);
    }
}

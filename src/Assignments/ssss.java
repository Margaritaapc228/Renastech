package Assignments;

import java.util.Scanner;

public class ssss {
    private static Scanner ka=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter size for Array ");
        int[] size=new int[ka.nextInt()];
        printArray(size);
    }
    private static void printArray(int[] arr) {

        System.out.println("Enter the Elements");
        int[] myIntArray=arr;
        for (int i=0 ; i<myIntArray.length ;i++){
            myIntArray[i]= ka.nextInt();
        }
        int sum=0;
        for (int i=0 ; i<myIntArray.length ; i++){
            System.out.println("Elements" + i + ", value is " + myIntArray[i]);
            sum +=myIntArray[i];
        }
        System.out.println("Sum of Elements Are " + sum);
        System.out.println("Average is " + sum/myIntArray.length);
    }
}

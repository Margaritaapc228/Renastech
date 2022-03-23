package day_17;

import java.util.Scanner;

public class C5_2Array2D {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter NO. rows");
        int r = scan.nextInt();
        System.out.println("Enter NO. columns");
        int c = scan.nextInt();
        int sum=0;
        int average=0;

        int arr[][] = new int[r][c];
        System.out.println("Enter the elements ");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                arr[i][j] = scan.nextInt();
            }
        }
        System.out.println("Entered array is");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                System.out.print(arr[i][j]+"\t");
                sum+=arr[i][j];
                average=sum/(r*c);

            }
            System.out.println();

        }
        System.out.println("The sum is:"+ sum);
        System.out.println("The average is:"+ average);

    }
}


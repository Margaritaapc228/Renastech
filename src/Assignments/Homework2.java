package Assignments;

public class Homework2 {
    public static void main(String[] args) {

        //1.)  Write a Java program to print the result of the following operations.
        int a = -5 + 8 * 6 ;
        int b = (55+9) % 9 ;
        int c = 20 + -3*5 / 8 ;
        int d = 5 + 15 / 3 * 2 - 8 % 3 ;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println();

        //2.) Write a Java program that prints the multiplication table of a number. For example, below is the output for multiplication table of 2.
        int number = 2;
        for (int i=1; i<10;i++){
         System.out.println(number + "*" + i + "=" + (number * i));
        }
    }

}

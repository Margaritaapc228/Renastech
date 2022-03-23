package Assignments;

import java.util.Scanner;

public class practiceScanner {
    public static void main(String[] args) {

        Scanner feel = new Scanner(System.in);
        System.out.println("Enter a number for know your feeling:");
        int x = feel.nextByte(); System.out.println(x);
            int y = 6;
            ;
            switch (x) {
                case 1: {
                    System.out.println("You are Happy!");
                    break;
                }
                case 2: {
                    System.out.println("You are Sad!");
                    break;

                }
                case 3: {
                    System.out.println("You are Angry!");
                    break;

                }
                case 4: {
                    System.out.println("You are Surprised!");
                    break;

                }
                default: {
                    System.out.println("Unknown emotion");
                    break;

                }
            }


        }
    }

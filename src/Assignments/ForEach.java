package Assignments;

import java.util.Scanner;

public class ForEach {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Write some frase:");

        String sentence = scan.nextLine();
        String[]words = sentence.split(" ");

        System.out.println("The Sentence is: " + sentence);

        System.out.println("Reverse Sentence: ");
        for (int i=words.length-1 ;i>=0; i--) {
            System.out.print(words[i] + " ");
        }



    }
}

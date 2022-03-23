package Day_6;

import Fundamentals.PractiseSymbol;

public class C7IfPractice {

    /*

    Points     Grades
    91 - 100      A
    75 - 90       B
    60 - 74       C
    40 - 59       D
    <40           E

     */

    public static void main(String[] args) {

        int points = 95; char grade = 'E';
        if (points>=91) grade = 'A';
        if (points>=75) grade = 'B';

        System.out.println(grade);

    }
}

package Day_7;

public class C5IfElse {

    public static void main(String[] args) {

        /*
        Points      Grades
        91 - 100    A
        75-90       B
        60-74       C
        40-59       D
        <40         E
        * */

        int points = 50;

        if (points >= 91) System.out.println("A");
        else if (points >= 75) System.out.println("B");
        else if (points >= 60) System.out.println("C");
        else if (points >= 40) System.out.println("D");
        else if (points <= 40) System.out.println("E");
    }

}

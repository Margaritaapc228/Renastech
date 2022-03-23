package Day_7;

public class C6IfElse {

    /*
    Age          Advice
    0-5          get loved
    6-10         play
    11-20        study
    21-60        work
    >60          retire and pray to God
     */

    public static void main(String[] args) {

        int age = 25;
        if (age<=5)          System.out.println("Get loved");
        else if (age<=10)    System.out.println("Play");
        else if (age<=20)    System.out.println("Study");
        else if (age<=60)    System.out.println("Work");
        else if (age>60)     System.out.println("Retired and pray to God");



    }
}

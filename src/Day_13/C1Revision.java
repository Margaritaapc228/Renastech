package Day_13;

import sun.jvm.hotspot.interpreter.BytecodeCheckCast;

import java.util.Scanner;

public class C1Revision {

    /*
    11) WAP to enter marks in 5 subjects out of 100. If marks in any subject is less than 33 then it's a faliure. Your program should output the no. of subjects the person is failing in else it should print PASS.
	50
	60
	98
	58
	81
     */
    public static void main(String[] args) {

        float english, maths, science, history,computers;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter marks out of 100 for the following sujects");
        System.out.println("English:"); english=scan.nextFloat();
        System.out.println("maths:"); maths=scan.nextFloat();
        System.out.println("science:"); science=scan.nextFloat();
        System.out.println("history:"); history=scan.nextFloat();
        System.out.println("computers:");computers=scan.nextFloat();

        byte count = 0;
        if (english<33) count++;
        if (maths<33) count++;
        if (science<33) count++;
        if (history<33) count++;
        if (computers<33) count++;

        if (count>1) {
            System.out.println("The student is failing in " + count + "subjects");
        }
        else
            System.out.println("PASS");

    }
}

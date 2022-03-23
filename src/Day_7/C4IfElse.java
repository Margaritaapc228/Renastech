package Day_7;

public class C4IfElse {

    public static void main(String[] args) {

        /**
         Salary
         10k to 50k go to California
         50k go 90k Europa
         >120k go on a World Tour
         <10000 go to Park
         */

        int salary = 100000;
        if (salary<10000)
            System.out.println("Go to the Park");

        // else block will run only if salary is greater than 10000
        else {
            if (salary<10000)
                System.out.println("Go to California");
            else {
                if (salary<90000)
                    System.out.println("Go to Europa");
                else {
                    System.out.println("Go on a World tour");
                }

            }
        }

    }
}

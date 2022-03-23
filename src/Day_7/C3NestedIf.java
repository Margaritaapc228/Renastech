package Day_7;

public class C3NestedIf {

    public static void main(String[] args) {

        /*int population = 5451, area = 5697 ;
        if (population<10000) {

            if (area < 10000) {
                System.out.println("Small country");
            } else
                System.out.println("population is less than 10000 but" + "\narea is greater than 10000");*/

           int population = 20000, area = 5697 ;
        if (population<10000 && area<10000) System.out.println("Small country");
        else if (population>10000 && area<10000) System.out.println("area small, population big");
        else if (population<10000 && area>10000) System.out.println("area big, population small");
        else if (population>10000 && area>10000) System.out.println("__");


    }
    }

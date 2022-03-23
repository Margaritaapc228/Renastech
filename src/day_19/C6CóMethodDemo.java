package day_19;

public class C6CóMethodDemo {

    public static void main(String[] args) {

        System.out.println("Hello");
        show();
        System.out.println(show());


        //return keyword means method is supposed to terminate at this point
        return;

        // System.out.println();
        //int i; error: unreachable statement
    }

    static char show(){
        return 65;
    }
}

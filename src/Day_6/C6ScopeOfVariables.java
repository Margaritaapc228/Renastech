package Day_6;

public class C6ScopeOfVariables {

    public static void main(String[] args) {

        System.out.println("This is before a block of code");


        if (false) {
            System.out.println("This is inside a block of code");
            int i = 10;
            System.out.println(i);
        }

        int i = 20;
        System.out.println(i);

    if ('a'!='b')
        System.out.println("This is after a block of code");
    }
}

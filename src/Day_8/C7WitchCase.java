package Day_8;

public class C7WitchCase {

    public static void main(String[] args) {

        int a = 10, b = 20;
        System.out.println("Numbers are a =" + a + "\tb =" + b);

        System.out.println("Press \n1 for addition\n2 for subtraction\n3 for multiplication");
        int option = 3;

        switch (option) {
            case 1: System.out.println("This is case 1");
                    System.out.println("a+b=" + (a + b));
                    break;

            case 2: System.out.println("This is case 2");
                    System.out.println("a-b=" + (a - b));
                    break;

            case 3: System.out.println("This is case 3");
                    System.out.println("a*b=" +(a*b));
                    break;

            case 4: System.out.println("This is case 4");
                    System.out.println("a/b=" + (a/b));
                    break;

            default:
                System.out.println("Invalid entry");
                break;


        }

    }
}


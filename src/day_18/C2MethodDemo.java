package day_18;

public class C2MethodDemo {


    public static void main(String[] args) {
        //ising a method means calling or invoking a method

        //below statement calls the show method
        // and main is the calling method as show is being called from the main method
        show();

    }

    static void show() {
        System.out.println("This is show method");
    }

    static void play() {
        System.out.println("Play method");
    }


}

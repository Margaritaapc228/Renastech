package day_18;

public class C3MethodDemo {

    public static void main(String[] args) {

        //any variable declared inside a methodis called a local variable
        int i=10;
        m1();
        System.out.println("hello people");
    }

    static void m1(){
        m2();
        int j = 50; //local variable
        System.out.println("m1 method");
    }

    static void m2() {
        int k = 30; //local variable
        System.out.println("m2 method");
    }
}

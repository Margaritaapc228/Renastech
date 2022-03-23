package day_19;

public class C1MethodDemo {

    public static void main(String[] args) {

        show("Tom", 65);
        show();
        show("Tom", 65);
    }

    /*
    When two or mare methods have the same name, this is called overloading
     */
    static void  show(String name, int salary){
        System.out.println(name + "\t" + salary);
    }

    static void show(){
        System.out.println("no-args show method");
    }
}

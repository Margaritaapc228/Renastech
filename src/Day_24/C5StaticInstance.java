package Day_24;

public class C5StaticInstance {

    public static void main(String[] args) {
        show();
        C5StaticInstance.show();
        Temp.display();
        Temp . display();
        Temp t = new Temp();
        t.display();

    }

    static void show() {
        System.out.println("Hello");

    }

    void play() {
        System.out.println("Hi");

    }
}
class Temp{
        static void display(){
            System.out.println("Slav");
        }

}

package Day_26;

public class C1Revision {
    public static void main(String[] args) {
        Mercedes m= new Mercedes();
        m.show();
    }

}
class Car{
    int i=10;
    void show(){
        System.out.println("Hello hello ");
    }
}


class Mercedes extends Car{
    @Override
    void show() {
            System.out.println("Hi");
        }
    }


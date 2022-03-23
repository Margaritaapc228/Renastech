package Day_24;

public class C6StaticInstance {

    public static void main(String[] args) {

        new Apple() .eatApple();
        new Apple() .eatApple();
        Apple a1= new Apple();
        a1.eatApple();

        System.out.println(a1);
        System.out.println(Apple.getNumber());


    }
}

class Apple{

    static int appleCount;
    void eatApple(){
        System.out.println("Eating apple");
    }

    Apple (){
        appleCount++;
    }
    static int getNumber(){
        return 5;
    }

}

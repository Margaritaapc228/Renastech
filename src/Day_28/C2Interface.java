package Day_28;

public class C2Interface {
    public static void main(String[] args) {
        Eat.eatPasta();
        Eat e = new EatingFood(); e.eatPizza(); e.eatSomethingtolive();
    }
}

interface   Eat {
    void eatPizza();
    static void eatPasta(){System.out.println("You can eat pasta if you want");}
    default void eatSomethingtolive(){
        System.out.println("Eat fruits");
    }
}

class EatingFood implements Eat{

    public void eatPizza(){

    }
}
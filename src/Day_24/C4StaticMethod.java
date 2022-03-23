package Day_24;

public class C4StaticMethod {

    public static void main(String[] args) {

        //Below is the anonymus object. when the reference of the pbject is not stared
        //In a avariable, it is called an anonymous object

        new Demo(). play();

        Demo d = new Demo(); d.play();

    }
}

class Demo{
    static int a=10;

    static void show (){
        System.out.println("Show");
        //play();// error: a non-static method cannot be directly from inside an instance method
    }

    void play(){
        System.out.println("Play");
        show();
    }
}

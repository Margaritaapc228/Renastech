package Day_22;

public class C6Object {
    public static void main(String[] args) {

        Box b1 = new Box();
        System.out.println(b1.breadth);
        System.out.println(b1.length);
        System.out.println(b1.height);
        System.out.println(b1.volume());
        b1.height= 10;b1.breadth= 5;b1.height= 2.2;
        System.out.println(b1.breadth);
        System.out.println(b1.length);
        System.out.println(b1.height);
        System.out.println(b1.volume());
        System.out.println(b1.volume());

    }

}

class Box{

    //properties of the box object
    double length=5;
    double breadth;
    double height;


    //behavior of the box object
    double volume(){
        return length*breadth*height;
    }

}

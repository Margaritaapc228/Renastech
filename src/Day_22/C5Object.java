package Day_22;

public class C5Object {

    public static void main(String[] args) {

        //create an instance of the class car
        Car c = new Car();
        System.out.println(c.color);
        System.out.println(c.type);
        c.accelerate();

    }
}

class Car{

    //properties of the car object or instance variables
    String color = "Red";
    String type = "Sedan";


    void accelerate(){
        System.out.println("push accelerator");
    }
}
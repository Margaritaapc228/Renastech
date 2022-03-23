package Day_22;

public class C7Object {
// intance variable
    //class is blueprint, template, pritype (icindekiler)
    String breed;
    String size;
    int age;
    String color;
    String getInfo(){
        return ("Breed is:" +  breed + "Size is:"+ size + "Age is:"+ age + "Color is:" + color);

    }

    public static void main(String[] args) {
        C7Object d1=new C7Object();
        d1.breed="American cocker Spanieel";
        d1.size="Small";
        d1.color="Brown";
        System.out.print(d1.getInfo());


    }
}

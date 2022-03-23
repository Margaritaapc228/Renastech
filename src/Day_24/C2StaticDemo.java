package Day_24;

public class C2StaticDemo {
    public static void main(String[] args) {
        Emp e1 = new Emp("Batman", 250);
        Emp e2 = new Emp("Robin", 200);

        System.out.println(e1.company);
        System.out.println(e2.company);

    }
}

class Emp{
    //A static variable take memory in the MetaSpace
    //A static variabe takes memory only once when the class is loaded in the memory
    static String company="IBM";
    String name;int salary;

    Emp(String name, int salary){
        this.name=name;
        this.salary=salary;
    }
}
package Day_9;

public class C6ForLoop {

    public static void main(String[] args) {

        int n = 100;
        //print even numbers from 1 to n
       /* for (int i=0; i<=n; i=i+2)
            System.out.println(i+" cheetah");
            System.out.println("panda");*/
        System.out.println("EVEN\t\tODD");
        for (int i=0; i<=100; ++i){
            System.out.println(i+"\t\t\t"+ ++i);
        }

    }
}

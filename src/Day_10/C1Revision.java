package Day_10;

public class C1Revision {

    public static void main(String[] args) {

        int n=8;
        boolean flag = true ;

        for (int i=2; i<n; i++){

            if (n%i == 0){
                flag = false;

            }
        }
        if (flag)
            System.out.println(" Prime number");
        else
            System.out.println(" Not prime");

    }
}

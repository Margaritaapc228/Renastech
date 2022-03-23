package Day_10;

public class C3ForLoop {

    //print the following series using for loop
    //1/2    2/3    3/4    4/5 .....n-1/n

    public static void main(String[] args) {
        int n= 20;
        for (int i = 1; i<=n; i++){

            System.out.println(i+ "/"+(i+1)+"   ");
        }
    }
}

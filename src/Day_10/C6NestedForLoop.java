package Day_10;

public class C6NestedForLoop {
    /*
    54321
    5432
    543
    54
    5
    */

    public static void main(String[] args) {

        for (int x=1; x<=5; x++){
            for (int y=5; y>=x; y--){

                System.out.print(y);


            }

            System.out.println();
        }
    }

}

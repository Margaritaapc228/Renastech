package day_19;

public class C9MethodDemo {

    public static void main(String[] args) {
        int arr[]= {10,20,30,5 };
        printArray(arr);

        int arr2[]= {3,9,8};
        System.out.println("\nSecond array");
        printArray(arr2);
        System.out.println("\nThird array");

        //anonymous array (an array with no name) as the argument
        printArray(new int []{9,8,4,2,10,0,2});
    }

    //printArray method takes int tye array as argument
    static void printArray (int [] arr){

        for (int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

    }
}

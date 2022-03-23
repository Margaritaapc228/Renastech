package day_5;

public class C2_ClassAssigmen {
    public static void main(String[] args) {
        int i= 567 , sum = 0;

        int digit1 = i%10;
        int new_number=i/10;

        int digit2 =new_number % 10;

        int digit3 = new_number%10;

        sum = digit1 + digit2 + digit3;
        System.out.println(sum);
    }
}

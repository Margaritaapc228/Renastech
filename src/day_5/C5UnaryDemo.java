package day_5;

public class C5UnaryDemo {

    public static void main(String[] args) {

        int i = 5;
        i++;
        System.out.println(i);

        ++i;
        System.out.println(i);

        System.out.println(++i);//8 pre-increment operator(change the value in the memory and after in the program)
        System.out.println(i++);//8 post-increment operator(change the value in the program and after in the memory)
        System.out.println(i);

    }
}

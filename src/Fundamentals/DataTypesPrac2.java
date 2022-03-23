package Fundamentals;

public class DataTypesPrac2 {

    public static void main(String[] args) {

        /*
            PRIMITIVE DATA IN JAVA
            byte        1 byte (8 bits)       -128 to 127
            short       2 bytes (16 bits)
            int         4 bytes (32 bits)
            long        8 bytes (64 bits)
            float       4 bytes (32 bits)
            double      8 bytes (64 bits)
            char        2 bytes (16 bits)
            bollean     depends on the internat implementation
         */

        byte b = 10 ;
        System.out.println(b);
        b = 120;
        System.out.println(b);   // b = 128;
        byte age = 50;

        short s = 200 ; System.out.println(s);

        int salary = 5640575 ;

       // int phone_number = 2013884832 ;

        //to specify a long literal we use the siffex L
        long phone_number = 2013884832L ;


        /*Any constant value in Java is called a Literal.
        By default all integral values within the range of int are treated as int literals
        If we use a literal within the range of int, the literal is by default
        treated as an int literal, so suffix L is not required.
         */



    }
}

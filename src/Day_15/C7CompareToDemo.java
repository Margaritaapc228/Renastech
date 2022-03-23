package Day_15;

public class C7CompareToDemo {

    public static void main(String[] args) {


    /*
    The compareTo() method compares two strings lexicographically (in the dictionary order OR lexical order).
    the comparison is based on the Unicode value of each character in the strings.
    If the characters of the shorter string are same as those corresponding to the longer string,
    difference in the umber of characters is returned
     */

    System.out.println("Girlish". compareTo("girl"));

    /*
    compareTo returns
    1) +ve number: this string comes after the specified string
    2)-ve number: this string comes before the specified string i.e. this string
            is smaller than the specified string
    3)0     : this string is equal to the specified string

     */
}}

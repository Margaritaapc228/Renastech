package day_18;

public class C4MethodDemo {

    //public and static are modifiers
    //public: access modifier
    // static : non-access modifier
    //void : return type
    //main : name of the method
    // String[]: argument or parameter type; args is a variable of string []
    //[{} : body of the method

    public static void main(String[] args) {

    }

    //a method can be declaring a method
    void display (){
        return;//returning statement without a returning value ->OPTIONAL
    }

    //modifier is static, return type is int, method name is getSalary
    //one int parameter
    static int getSalary(int days_worked){

        return 1000000;//returning statement
    }
}

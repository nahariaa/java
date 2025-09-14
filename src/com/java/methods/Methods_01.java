package com.java.methods;

public class Methods_01 {

    //SYNTAX
    /*returnType methodName(dataType parameter1, dataType parameter2) {
        //body;
    }*/

    public static void main(String args[]) {
        int a = 5;
        int b = 10;
        int c;

        c = max(a, b);
        System.out.println("Maximum number is: "+c);
        System.out.println("Value of 'a' inside main(): "+a);
    }

    static int max(int x, int y) {
        //Pass by Value Example - x will be 6 here even though we passed 5 in it
        x++;
        System.out.println("Value of 'x' after incrementing it from max(): " +x);
        return x > y ? x : y;
    }
}



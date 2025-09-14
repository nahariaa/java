package com.java.methods;


/*
    We achieve Polymorphism by Method Overloading. Same name but different behavior.
*/
public class MethodOverloading {

    static int max(int a, int b){
        return a > b ? a : b;
    }

    //overloaded method by the same name
    static float max(float a, float b){
        return a > b ? a : b;
    }

    public static void main(String[] args) {

        System.out.println(max(1,2));
        System.out.println(max(1.1f,2.2f)); //will call method max() which accepts floating point numbers

    }
}

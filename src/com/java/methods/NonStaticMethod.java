package com.java.methods;

public class NonStaticMethod {
    int x = 10;
    int y = 20;
    public static void main(String[] args) {
        NonStaticMethod obj = new NonStaticMethod();
        System.out.println(obj.add(10, 20));    //actual parameters
    }

    //formal parameters
    int add(int x, int y){
        return x + y;
    }
}

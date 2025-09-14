package com.java.methods;

//variable arguments
public class VarArgs {
    public static void main(String[] args) {
        max(1, 2, 3, 4, 5);
    }

    static void max(int ...x){
        System.out.println(x.length);
    }

    static void min(int x, int ...y){
        //body goes here
    }
}

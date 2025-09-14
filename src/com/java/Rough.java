package com.java;

public class Rough {

    static void printMe() {
        System.out.println("Static method");
    }
    public static void main(String[] args) {
        Rough rg = new Rough();
        rg.printMe();
        printMe();
    }
}

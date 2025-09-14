package com.java.chapter_7_inheritance.polymorphism;

public class SupSubRef {
    public static void main(String[] args) {
        X x2;
        Y y = new Y(5, 6);

        x2 = y; //a superclass reference can refer to a sub-class object

        System.out.println("x2.a: " + x2.a);
    }
}

package com.java.chapter_9_exception_handling;

public class ThrowDemo {
    public static void main(String[] args) {
        try{
            System.out.println("Before throwing an error");
            throw new ArithmeticException();
        } catch (ArithmeticException exception) {
            System.out.println("Arithmetic exception caught" + exception);
        }
    }
}

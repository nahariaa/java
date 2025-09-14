package com.java.chapter_9_exception_handling;

public class NestedTrys {
    public static void main(String[] args) {
        int[] a = { 4, 8, 16, 32, 64, 128, 256, 512 };
        int[] b = { 2, 0, 4, 4, 0, 8 };

        try{
            for (int i = 0; i < a.length; i++) {
                try {
                    System.out.println(a[i] + " / " + b[i] + " is " + a[i] / b[i]);
                } catch (ArithmeticException exception) {
                    System.out.println("Can't divide by zero!");
                }
            }
        } catch (IndexOutOfBoundsException exception) {
            System.out.println("IndexOutOfBoundsException occurred");
            System.out.println("Terminating the program");
        }
    }
}

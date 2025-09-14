package com.java.chapter_9_exception_handling;

public class ExceptionDemoThird {
    public static void main(String[] args) {
        int[] a = { 4, 8, 16, 32, 64, 128, 256, 512 };
        int[] b = { 2, 0, 4, 4, 0, 8 };

        for(int i = 0; i < a.length; i++) {
            try {
                System.out.println(a[i] + " / " + b[i] + " is " + a[i] / b[i]);
            } catch (ArithmeticException exception) {
                System.out.println("Can't access this index!");
            } catch (Throwable exception) {
                System.out.println("Can't divide by Zero!" + " Dividing " + a[i] + " by " +b[i]);
            }
        }
    }
}

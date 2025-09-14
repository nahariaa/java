package com.java.chapter_9_exception_handling.finally_demo;

public class UseFinally {
    public static void genException(int what) {
        try {
            System.out.println("Receiving " + what);
            switch (what) {
                case 0:
                    int t = 10 / what;
                    break;
                case 1:
                    int nums[] = new int[2];
                case 2:
                    return;
            }
        } catch (ArithmeticException exc) {
            System.out.println("Can't divide by Zero!");
            return;
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("No matching element found.");
        } finally {
            System.out.println("Leaving try, executing finally block.");
        }
    }
}

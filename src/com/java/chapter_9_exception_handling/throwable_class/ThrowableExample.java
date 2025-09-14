package com.java.chapter_9_exception_handling.throwable_class;

public class ThrowableExample {
    public static void main(String[] args) {
        try{
            ThrowableExample.getException();
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Standard Message is: ");
            System.out.println(exc);

            System.out.println("\nStack trace: ");
            exc.printStackTrace();
        }
    }

    static void getException() {
        int nums[] = new int[4];
        nums[7] = 10; // Exception generated here
    }
}

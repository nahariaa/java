package com.java.chapter_9_exception_handling;

public class ExceptionDemoFirst {
    public static void main(String[] args) {
        int[] nums = new int[4];

        //caught exception demo
        try {
            System.out.println("Before exception is occurred");
            nums[7] = 10;
            System.out.println("This won't be displayed!!!");
        } catch (IndexOutOfBoundsException exception) {
            System.out.println("Index-out-of-bounds-exception-occurred");
        }
        System.out.println("After Catch Statement");

        //consequences of an uncaught exception
//        System.out.println("Before exception is generated.");   //This will be printed
//        nums[7] = 10;
//        System.out.println("After exception is generated.");    //This won't be printed
    }
}

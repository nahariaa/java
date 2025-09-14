package com.java.chapter_9_exception_handling.rethrow;

public class Rethrow {
    public static void getException() {
        int numer[] = { 4, 8, 16, 32, 64, 128, 256, 512 };
        int denom[] = { 2, 1, 4, 4, 1, 8 };

        for(int i = 0; i < numer.length; i++) {
            try {
                int a = numer[i] / denom [i];
            } catch (ArrayIndexOutOfBoundsException exception) {
                System.out.println("No matching element found for the given index");
                throw exception;
            }
        }
    }
}

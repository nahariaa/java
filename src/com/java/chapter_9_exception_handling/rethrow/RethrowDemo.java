package com.java.chapter_9_exception_handling.rethrow;

public class RethrowDemo {
    public static void main(String[] args) {
        try {
            Rethrow.getException();
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Terminating the program execution!");
        }
    }
}

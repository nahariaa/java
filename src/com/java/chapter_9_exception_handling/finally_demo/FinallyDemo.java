package com.java.chapter_9_exception_handling.finally_demo;

public class FinallyDemo {
    public static void main(String[] args) {
        for(int i = 0; i < 3; i++) {
            UseFinally.genException(i);
            System.out.println();
        }
    }
}

package com.java.chapter_8.interfaces2;

public interface DefaultMethods {
    int getUserId();

    default int getAdminId() {
        return 1;
    }

    default void printMyName(String myName) {
        System.out.println("My name is " +myName);
    }
}

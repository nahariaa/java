package com.java.chapter_sixth.copy_constructor;

public class ShallowCopyDemo {
    public static void main(String[] args) {
        Address address = new Address("New York");
        ShallowStudentCopy originalStudent = new ShallowStudentCopy(101, address);

        ShallowStudentCopy copiedStudent = new ShallowStudentCopy(originalStudent);

        System.out.println("--- Before modification ---");
        System.out.println("Original: " + System.identityHashCode(originalStudent.address));
        System.out.println("Copy:   " + System.identityHashCode(copiedStudent.address));

        copiedStudent.address.city = "Los Angeles";

        System.out.println("--- After modifying the copy ---");
        System.out.println("Original: " + originalStudent);
        System.out.println("Copy: " + copiedStudent);
    }
}

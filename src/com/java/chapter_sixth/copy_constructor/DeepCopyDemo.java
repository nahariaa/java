package com.java.chapter_sixth.copy_constructor;

class DeepCopyDemo {
    public static void main(String[] args) {
        // Original student object
        Address address = new Address("New York");
        DeepStudentCopy originalStudent = new DeepStudentCopy(101, address);

        // Create a deep copy using the copy constructor
        DeepStudentCopy copiedStudent = new DeepStudentCopy(originalStudent);

        System.out.println("--- Before modification ---");
        System.out.println("Original: " + System.identityHashCode(originalStudent.address));
        System.out.println("Copy:     " + System.identityHashCode(copiedStudent.address));

        // Now, change the city in the COPIED student's address
        copiedStudent.address.city = "Los Angeles";

        System.out.println("\n--- After modifying the copy ---");
        System.out.println("Original: " + originalStudent); // ➡️ The original is NOT affected!
        System.out.println("Copy:     " + copiedStudent);
    }
}

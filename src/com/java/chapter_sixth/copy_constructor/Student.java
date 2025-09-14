package com.java.chapter_sixth.copy_constructor;

public class Student {
    int id;
    Address address;

    public Student(int id, Address address) {
        this.id = id;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student[id=" + id + ", " + address.toString() + "]";
    }
}

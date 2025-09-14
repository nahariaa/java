package com.java.chapter_sixth.copy_constructor;

public class ShallowStudentCopy {

    int id;
    Address address;

    public ShallowStudentCopy(int id, Address address) {
        this.id = id;
        this.address = address;
    }

    public ShallowStudentCopy(ShallowStudentCopy other) {
        this.id = other.id;
        this.address = other.address;
    }

    @Override
    public String toString() {
        return "Student[id=" + id + ", " + address.toString() + "]";
    }
}

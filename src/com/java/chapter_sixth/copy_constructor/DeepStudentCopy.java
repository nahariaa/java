package com.java.chapter_sixth.copy_constructor;

class DeepStudentCopy {
    int id;
    Address address;

    public DeepStudentCopy(int id, Address address) {
        this.id = id;
        this.address = address;
    }

    // Deep Copy Constructor
    public DeepStudentCopy(DeepStudentCopy other) {
        this.id = other.id;
        // The key difference: create a NEW Address object
        this.address = new Address(other.address.city);
    }

    @Override
    public String toString() {
        return "Student[id=" + id + ", " + address.toString() + "]";
    }
}

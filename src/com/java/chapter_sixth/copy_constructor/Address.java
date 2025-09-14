package com.java.chapter_sixth.copy_constructor;

public class Address {
    String city;

    public Address(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address[city=" + city + "]";
    }
}

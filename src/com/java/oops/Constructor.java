package com.java.oops;

public class Constructor {
    private double length, breadth;

    public Constructor() {
        length = 1;
        breadth = 1;
    }

    public Constructor(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public Constructor(double s) {
        length = breadth = s;
    }
}

package com.java.chapter_7_inheritance.shape;

public class TwoDShape {
    private double width;
    private double height;

    void showDimensions() {
        System.out.println("Width and height are " + width + " and " + height);
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return this.width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }

    TwoDShape() {
        System.out.println("This is a parent constructor");
    }

    TwoDShape(int a) {
        System.out.println("This is a parent parameterzied constructor");
    }
}

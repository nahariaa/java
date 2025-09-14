package com.java.chapter_7_inheritance.shape;

public class Triangle extends TwoDShape{
    String style;

    double area() {
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Triangle is " + style);
    }

    Triangle() {
        this(10);
        System.out.println("This is a child constructor");
    }

    Triangle(int a) {
        System.out.println(a);
    }
}

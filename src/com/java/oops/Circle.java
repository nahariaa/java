package com.java.oops;

public class Circle {

    double radius;
    double pie = 3.14159;

    public double circumference(double radius) {
        this.radius = radius;
        double circum = 2 * this.pie * this.radius;
        return circum;
    }

    public double area(double radius) {
        this.radius = radius;
        double area = this.pie * this.radius * this.radius;
        return area;
    }

    public double diameter(double radius) {
        this.radius = radius;
        double diameter = this.radius * 2;
        return diameter;
    }
}


class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println("Circumference: " +circle.circumference(2));
        System.out.println("Area: " +circle.area(3));
        System.out.println("Diameter: " +circle.diameter(3));
    }
}

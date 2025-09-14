package com.java.inheritance;

public class CylinderExtendsCircleMain {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(5, 10);

        System.out.println("Radius: " + cylinder.getRadius());
        System.out.println("Height: " + cylinder.getHeight());
    }
}

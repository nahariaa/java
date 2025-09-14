package com.java.chapter_sixth;

public class AccessDemo {
    public static void main(String[] args) {
        MyClass obj1 = new MyClass(10, 2, 5);
        MyClass obj2 = new MyClass(10, 2, 5);
        MyClass obj3 = new MyClass(4, 5, 5);

        System.out.println("ob1 same dimensions as ob2: " +obj1.sameBlock(obj2));
        System.out.println("ob1 same dimensions as ob3: " +obj1.sameBlock(obj3));
        System.out.println("ob1 same volume as ob3: " +obj1.sameVolume(obj3));
    }
}

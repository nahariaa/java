package com.java.chapter_7_inheritance.overriding_polymorphism;

public class DynDispDemo {
    public static void main(String[] args) {
        Sup superObj = new Sup();
        Sub1 subObj1 = new Sub1();
        Sub2 subObj2 = new Sub2();

        Sup supRef;

        supRef = superObj;
        supRef.who();

        supRef = subObj1;
        supRef.who();

        supRef = subObj2;
        supRef.who();
    }
}

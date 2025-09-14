package com.java.chapter_sixth;

public class MyClass {

    int a, b, c;
    int volume;

    MyClass(int i, int j, int k){
        a = i;
        b = j;
        c = k;
        volume = a * b * c;
    }

    boolean sameBlock(MyClass ob) {
        return (ob.a == a) & (ob.b == b) & (ob.c == c);
    }
    boolean sameVolume(MyClass ob) {
        return ob.volume == volume;
    }
}

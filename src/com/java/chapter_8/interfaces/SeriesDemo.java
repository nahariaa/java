package com.java.chapter_8.interfaces;

public class SeriesDemo {
    public static void main(String[] args) {
        ByTwos twoOb = new ByTwos();
        ByThrees threeOb = new ByThrees();

        Series ob;

        ob = twoOb;
        System.out.println("Next ByTwos value is " + ob.getNext());

        ob = threeOb;
        System.out.println("Next ByThrees value is " + ob.getNext());
    }
}
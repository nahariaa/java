package com.java.chapter_8.interfaces;

public class ByTwos implements Series{
    int start;
    int val;

    public int getNext() {
        val += 2;
        return val;
    }

    public void reset() {
        val = start;
    }

    public void start(int x) {
        start = x;
        val = x;
    }
}

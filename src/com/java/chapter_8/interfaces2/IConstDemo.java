package com.java.chapter_8.interfaces2;

public class IConstDemo implements IConst{
    public static void main(String[] args) {
        int nums[] = new int[MAX];
        int b = 0;

        for(int a : nums) {
            System.out.println(b);
            b++;
        }
    }
}

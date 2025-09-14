package com.java.chapter_10_io;

import java.io.IOException;

public class IntReadExample {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter characters ");
        int byteData;

        while((byteData = System.in.read()) != -1) {
            try{
                System.out.print((char) byteData);
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("/");
            }
        }
        System.out.println("\n--- End of Stream Reached ---");
    }

}

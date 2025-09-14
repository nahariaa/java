package com.java.chapter_10_io;

import java.io.IOException;

public class IntReadBufferExample {
    public static void main(String[] args) throws IOException {
        byte[] data = new byte[20];
        bufferRead();
/*
        System.out.println("Enter some characters and press Enter: ");

        //We will store data starting from index 3, and read at most 15 bytes.
        int offset = 3;
        int numToRead = 15;

        int bytesRead = System.in.read(data, offset, numToRead);

        System.out.println("Number of bytes actually read: " +bytesRead);

        System.out.print("Data read into the buffer: ");

        //We only loop through the bytes that were actually read.
        for(int i = offset; i < offset + bytesRead; i++) {
            System.out.print((char) data[i]);
        }
        System.out.println();*/
    }

    public static void bufferRead() throws IOException {
        byte[] data = new byte[10];
        // Tries to read 10 bytes from System.in and fill the 'data' array.
        int bytesRead = System.in.read(data);
        // 'bytesRead' will be 10 or less.
        System.out.println(bytesRead);

    }
}

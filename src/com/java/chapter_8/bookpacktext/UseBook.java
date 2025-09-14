package com.java.chapter_8.bookpacktext;
import com.java.chapter_8.bookpack.Book;

public class UseBook {
    public static void main(String args[]) {
        // Qualify Book with its package name: bookpack
        Book books[] = new Book[5];
        books[0] = new Book("Java: A Beginner's Guide", "Schildt", 2014);
        // ...and so on for the rest of the books
        for(int i=0; i < books.length; i++) books[i].show();
    }
}

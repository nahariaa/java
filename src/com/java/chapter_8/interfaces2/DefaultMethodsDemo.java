package com.java.chapter_8.interfaces2;

public class DefaultMethodsDemo {
    public static void main(String[] args) {
        DefaultMethodImpl def = new DefaultMethodImpl();
        System.out.println("User ID is " + def.getUserId());
        System.out.println("Admin ID is " + def.getAdminId());
        def.printMyName("Tushar");
    }
}

package com.java.chapter_sixth.static_;

public class StaticMemberDemo {
    public static void main(String[] args) {
        StaticMembers obj1 = new StaticMembers();
        StaticMembers obj2 = new StaticMembers();

        obj1.instanceVar = 10;
        StaticMembers.staticVar = 20;

        obj2.instanceVar = 11;
        obj2.staticVar = 12;

        System.out.println("Object 1: " +obj1.instanceVar + " and " +obj1.staticVar);
        System.out.println("Object 2: " +obj2.instanceVar + " and " +obj2.staticVar);
    }
}


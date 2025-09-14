package com.java.chapter_sixth;

public class ErrorInfoDemo {
    public static void main(String[] args) {
        ErrorInfo errInfo = new ErrorInfo();
        Err e;

        e = errInfo.getErrorInfo(1);
        System.out.println(e.msg + " severity: " +e.severity);
    }
}

package com.java.chapter_9_exception_handling.exception_chaining.exception;

// For failures in the business/service layer
public class OrderProcessingException extends Exception {
    public OrderProcessingException(String message, Throwable cause) {
        super(message, cause);
    }
}

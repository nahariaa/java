package com.java.chapter_9_exception_handling.exception_chaining.exception;

// For failures in the data/repository layer
public class DataAccessException extends Exception {
    public DataAccessException(String message, Throwable cause) {
        super(message, cause); // The 'cause' is the key to chaining
    }
}

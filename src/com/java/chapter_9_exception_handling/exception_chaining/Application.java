package com.java.chapter_9_exception_handling.exception_chaining;

import com.java.chapter_9_exception_handling.exception_chaining.exception.OrderProcessingException;
import com.java.chapter_9_exception_handling.exception_chaining.service.OrderService;

public class Application {
    public static void main(String[] args) {
        OrderService orderService = new OrderService();

        try {
            orderService.processOrder("ORD-542592");
        } catch (OrderProcessingException exc) {
            System.err.println("-----------------------------------------");
            System.err.println("FATAL ERROR: A bussiness operation failed.");
            System.err.println("Error Message: " + exc.getMessage());

            // This is how you unpack the chain of logging
            Throwable cause = exc.getCause();
            int level = 1;
            while (cause != null) {
                System.err.println("    Cause by (level " + level++ + "): " + cause.getClass().getName());
                System.err.println("    -> " + cause.getMessage());
                cause = cause.getCause();
            }

            System.err.println("\nFull stack trace for debugging:");
            exc.printStackTrace();
            System.err.println("-----------------------------------------");
        }
    }
}

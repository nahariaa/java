package com.java.chapter_9_exception_handling.exception_chaining.service;

import com.java.chapter_9_exception_handling.exception_chaining.exception.OrderProcessingException;
import com.java.chapter_9_exception_handling.exception_chaining.repoitory.OrderRepository;

import java.sql.SQLException;

public class OrderService {
    private final OrderRepository repository = new OrderRepository();

    public void processOrder(String orderId) throws OrderProcessingException {
        System.out.println("Service: Attempting to process order: " + orderId);
        try {
            // Call the low-level repository
            String orderData = repository.findOrderById(orderId);
        } catch (SQLException exc) {
            // Catch the low-level technical exception.
            // DO NOT let SQLException leak out of the service layer.

            // Wrap it in a domain-specific exception, PRESERVING THE CAUSE.
            // Here we add business context.
            throw new OrderProcessingException(
                    "Critical failure while processing order ID: " + orderId, exc
            );
        }
    }
}

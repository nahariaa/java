package com.java.chapter_9_exception_handling.exception_chaining.repoitory;

import java.sql.SQLException;

public class OrderRepository {
    // Simulates fetching an order from a DB that is currently offline
    public String findOrderById(String orderId) throws SQLException {
        // Imagine this is where a real JDBC call would happen
        throw new SQLException("Connection failed: Database is offline.");
    }
}

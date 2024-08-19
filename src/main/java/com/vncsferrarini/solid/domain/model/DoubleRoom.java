package com.vncsferrarini.solid.domain.model;

public class DoubleRoom extends Room {
    public DoubleRoom(final long id,
                      final String number,
                      final double price,
                      final boolean isAvailable,
                      final int capacity) {
        super(id, number, price, isAvailable, capacity);
    }
}
package com.vncsferrarini.solid.domain.model;

public class SingleRoom extends Room {
    public SingleRoom(final long id,
                      final String number,
                      final double price,
                      final boolean isAvailable,
                      final int capacity) {
        super(id, number, price, isAvailable, capacity);
    }
}

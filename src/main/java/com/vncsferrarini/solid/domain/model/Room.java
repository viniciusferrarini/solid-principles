package com.vncsferrarini.solid.domain.model;

import com.vncsferrarini.solid.common.enumeration.RoomType;
import lombok.Getter;

@Getter
public abstract class Room {

    private final String id;
    private final int number;
    private final double price;
    private final boolean isAvailable;
    private final int capacity;

    protected Room(final String id, final int number, final double price, final boolean isAvailable, final int capacity) {
        this.id = id;
        this.number = number;
        this.price = price;
        this.isAvailable = isAvailable;
        this.capacity = capacity;
    }

    public abstract RoomType getRoomType();

}

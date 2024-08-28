package com.vncsferrarini.solid.domain.model;

import com.vncsferrarini.solid.common.enumeration.RoomType;

public class DoubleRoom extends Room {

    public DoubleRoom(final String id, final int number, final double price, final boolean isAvailable, final int capacity) {
        super(id, number, price, isAvailable, capacity);
    }

    @Override
    public RoomType getRoomType() {
        return RoomType.DOUBLE_ROOM;
    }
}
package com.vncsferrarini.solid.domain.model;

import com.vncsferrarini.solid.common.enumeration.RoomType;
import com.vncsferrarini.solid.infra.entity.RoomEntity;
import com.vncsferrarini.solid.web.dto.RoomDto;
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

    public static Room create(final RoomDto roomDto) {
        return switchRoom(roomDto.id(), roomDto.number(), roomDto.price(), roomDto.capacity(), roomDto.isAvailable(), roomDto.roomType());
    }

    public static Room create(final RoomEntity entity) {
        return switchRoom(entity.getId(), entity.getNumber(), entity.getPrice(), entity.getCapacity(), entity.isAvailable(), entity.getRoomType());
    }

    private static Room switchRoom(final String id, final int number, final double price, final int capacity, final boolean isAvailable, final RoomType type) {
        return switch (type) {
            case SINGLE_ROOM -> new SingleRoom(id, number, price, isAvailable, capacity);
            case DOUBLE_ROOM -> new DoubleRoom(id, number, price, isAvailable, capacity);
            case SUITE_ROOM -> new SuiteRoom(id, number, price, isAvailable, capacity);
        };
    }

}

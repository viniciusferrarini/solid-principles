package com.vncsferrarini.solid.common.factories;

import com.vncsferrarini.solid.common.enumeration.RoomType;
import com.vncsferrarini.solid.domain.model.DoubleRoom;
import com.vncsferrarini.solid.domain.model.Room;
import com.vncsferrarini.solid.domain.model.SingleRoom;
import com.vncsferrarini.solid.domain.model.SuiteRoom;
import com.vncsferrarini.solid.infra.entity.RoomEntity;
import com.vncsferrarini.solid.web.dto.RoomDto;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public class RoomFactory {

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
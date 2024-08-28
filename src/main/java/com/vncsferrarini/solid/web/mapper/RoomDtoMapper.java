package com.vncsferrarini.solid.web.mapper;

import com.vncsferrarini.solid.domain.model.Room;
import com.vncsferrarini.solid.web.dto.RoomDto;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public class RoomDtoMapper {

    public static RoomDto fromDomain(final Room room) {
        return new RoomDto(room.getId(),
                room.getNumber(),
                room.getPrice(),
                room.isAvailable(),
                room.getCapacity(),
                room.getRoomType());
    }

}
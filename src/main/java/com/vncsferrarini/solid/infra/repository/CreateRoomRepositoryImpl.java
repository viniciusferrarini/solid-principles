package com.vncsferrarini.solid.infra.repository;

import com.vncsferrarini.solid.common.factories.RoomFactory;
import com.vncsferrarini.solid.domain.model.Room;
import com.vncsferrarini.solid.domain.repository.CreateRoomRepository;
import com.vncsferrarini.solid.infra.data.RoomData;
import com.vncsferrarini.solid.infra.entity.RoomEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;


@Repository
@RequiredArgsConstructor
public class CreateRoomRepositoryImpl implements CreateRoomRepository {

    private final RoomData roomData;

    @Override
    public Room create(final Room room) {
        return RoomFactory.create(roomData.save(toEntity(room)));
    }

    private RoomEntity toEntity(final Room room) {
        return RoomEntity.builder()
                .id(room.getId())
                .number(room.getNumber())
                .price(room.getPrice())
                .isAvailable(room.isAvailable())
                .capacity(room.getCapacity())
                .roomType(room.getRoomType())
                .build();
    }

}

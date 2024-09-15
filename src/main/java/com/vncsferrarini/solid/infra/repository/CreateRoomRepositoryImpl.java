package com.vncsferrarini.solid.infra.repository;

import com.vncsferrarini.solid.common.mapper.RoomMapper;
import com.vncsferrarini.solid.domain.model.Room;
import com.vncsferrarini.solid.domain.repository.CreateRoomRepository;
import com.vncsferrarini.solid.infra.data.RoomData;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;


@Repository
@RequiredArgsConstructor
public class CreateRoomRepositoryImpl implements CreateRoomRepository {

    private final RoomData roomData;
    private final RoomMapper mapper;

    @Override
    public Room create(final Room room) {
        return Room.create(roomData.save(mapper.toEntity(room)));
    }

}
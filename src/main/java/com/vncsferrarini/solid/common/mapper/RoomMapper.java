package com.vncsferrarini.solid.common.mapper;

import com.vncsferrarini.solid.domain.model.Room;
import com.vncsferrarini.solid.infra.entity.RoomEntity;
import com.vncsferrarini.solid.web.dto.RoomDto;
import org.mapstruct.Mapper;

@Mapper
public interface RoomMapper {

    RoomDto fromDomain(Room room);

    RoomEntity toEntity(Room room);

}
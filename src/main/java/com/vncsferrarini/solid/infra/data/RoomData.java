package com.vncsferrarini.solid.infra.data;

import com.vncsferrarini.solid.infra.entity.RoomEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RoomData extends MongoRepository<RoomEntity, String> {
}

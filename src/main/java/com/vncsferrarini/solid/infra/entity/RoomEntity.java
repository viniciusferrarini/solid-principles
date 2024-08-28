package com.vncsferrarini.solid.infra.entity;

import com.vncsferrarini.solid.common.enumeration.RoomType;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Builder
@Document
@RequiredArgsConstructor
public class RoomEntity {

    @Id
    private final String id;
    private final int number;
    private final double price;
    private final boolean isAvailable;
    private final int capacity;
    private final RoomType roomType;

}

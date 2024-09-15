package com.vncsferrarini.solid.web.controller;

import com.vncsferrarini.solid.application.usecase.CreateRoomUseCase;
import com.vncsferrarini.solid.common.mapper.RoomMapper;
import com.vncsferrarini.solid.domain.model.Room;
import com.vncsferrarini.solid.web.dto.RoomDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/rooms")
public class RoomController {

    private final CreateRoomUseCase createRoomUseCase;
    private final RoomMapper mapper;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public RoomDto create(@RequestBody RoomDto roomDto) {
        return mapper
                .fromDomain(createRoomUseCase.create(Room.create(roomDto)));
    }
}
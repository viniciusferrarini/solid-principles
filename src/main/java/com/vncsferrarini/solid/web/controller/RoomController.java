package com.vncsferrarini.solid.web.controller;

import com.vncsferrarini.solid.application.usecase.CreateRoomUseCase;
import com.vncsferrarini.solid.common.factories.RoomFactory;
import com.vncsferrarini.solid.web.dto.RoomDto;
import com.vncsferrarini.solid.web.mapper.RoomDtoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/rooms")
public class RoomController {

    private final CreateRoomUseCase createRoomUseCase;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public RoomDto create(@RequestBody RoomDto roomDto) {
        return RoomDtoMapper
                .fromDomain(createRoomUseCase.create(RoomFactory.create(roomDto)));

    }


}

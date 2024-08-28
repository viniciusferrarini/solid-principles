package com.vncsferrarini.solid.application.usecase.impl;

import com.vncsferrarini.solid.application.usecase.CreateRoomUseCase;
import com.vncsferrarini.solid.domain.model.Room;
import com.vncsferrarini.solid.domain.repository.CreateRoomRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CreateRoomUseCaseImpl implements CreateRoomUseCase {

    private final CreateRoomRepository repository;

    @Override
    public Room create(final Room room) {
        return repository.create(room);
    }

}

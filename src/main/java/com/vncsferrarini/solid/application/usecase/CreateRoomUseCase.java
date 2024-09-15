package com.vncsferrarini.solid.application.usecase;

import com.vncsferrarini.solid.domain.model.Room;
import com.vncsferrarini.solid.domain.repository.CreateRoomRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CreateRoomUseCase {

    private final CreateRoomRepository repository;

    public Room create(final Room room) {
        return repository.create(room);
    }

}

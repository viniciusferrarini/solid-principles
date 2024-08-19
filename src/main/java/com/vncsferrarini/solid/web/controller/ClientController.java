package com.vncsferrarini.solid.web.controller;

import com.vncsferrarini.solid.application.usecase.CreateClientUseCase;
import com.vncsferrarini.solid.domain.model.Client;
import com.vncsferrarini.solid.web.dto.ClientDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import static com.vncsferrarini.solid.web.mapper.ClientDtoMapper.fromDomain;
import static com.vncsferrarini.solid.web.mapper.ClientDtoMapper.toDomain;

@RestController
@RequestMapping("/clients")
@RequiredArgsConstructor
public class ClientController {

    private final CreateClientUseCase createClientUseCase;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ClientDto create(@RequestBody final ClientDto clientDto) {
        final Client createdClient = createClientUseCase.create(toDomain(clientDto));
        return fromDomain(createdClient);
    }

}
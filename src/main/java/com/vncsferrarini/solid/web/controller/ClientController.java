package com.vncsferrarini.solid.web.controller;

import com.vncsferrarini.solid.application.usecase.CreateClientUseCase;
import com.vncsferrarini.solid.common.mapper.ClientMapper;
import com.vncsferrarini.solid.domain.model.Client;
import com.vncsferrarini.solid.web.dto.ClientDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clients")
@RequiredArgsConstructor
public class ClientController {

    private final CreateClientUseCase createClientUseCase;
    private final ClientMapper mapper;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ClientDto create(@RequestBody final ClientDto clientDto) {
        final Client createdClient = createClientUseCase.create(mapper.toDomain(clientDto));
        return mapper.fromDomain(createdClient);
    }

}
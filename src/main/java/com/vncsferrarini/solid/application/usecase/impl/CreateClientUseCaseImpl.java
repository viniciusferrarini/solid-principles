package com.vncsferrarini.solid.application.usecase.impl;

import com.vncsferrarini.solid.application.usecase.CreateClientUseCase;
import com.vncsferrarini.solid.domain.model.Client;
import com.vncsferrarini.solid.domain.repository.CreateClientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CreateClientUseCaseImpl implements CreateClientUseCase {

    private final CreateClientRepository createClientRepository;

    @Override
    public Client create(final Client client) {
        return createClientRepository.create(client);
    }

}
package com.vncsferrarini.solid.application.usecase;

import com.vncsferrarini.solid.domain.model.Client;
import com.vncsferrarini.solid.domain.repository.CreateClientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CreateClientUseCase {

    private final CreateClientRepository createClientRepository;

    public Client create(final Client client) {
        return createClientRepository.create(client);
    }

}
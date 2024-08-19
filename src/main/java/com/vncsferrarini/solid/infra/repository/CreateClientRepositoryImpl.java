package com.vncsferrarini.solid.infra.repository;

import com.vncsferrarini.solid.domain.model.Client;
import com.vncsferrarini.solid.domain.repository.CreateClientRepository;
import com.vncsferrarini.solid.infra.data.ClientData;
import com.vncsferrarini.solid.infra.entity.ClientEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class CreateClientRepositoryImpl implements CreateClientRepository {

    private final ClientData clientData;

    @Override
    public Client create(final Client client) {
        return toDomain(clientData.save(toEntity(client)));
    }

    private static ClientEntity toEntity(final Client client) {
        return ClientEntity.builder()
                .name(client.name())
                .build();
    }

    private static Client toDomain(final ClientEntity client) {
        return Client.builder()
                .id(client.getId())
                .name(client.getName())
                .build();
    }

}
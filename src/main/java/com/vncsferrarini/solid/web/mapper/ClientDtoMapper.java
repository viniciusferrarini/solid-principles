package com.vncsferrarini.solid.web.mapper;

import com.vncsferrarini.solid.domain.model.Client;
import com.vncsferrarini.solid.web.dto.ClientDto;

public class ClientDtoMapper {

    public static Client toDomain(final ClientDto clientDto) {
        return Client.builder()
                .name(clientDto.name())
                .build();
    }

    public static ClientDto fromDomain(final Client client) {
        return ClientDto.builder()
                .id(client.id())
                .name(client.name())
                .build();
    }

}

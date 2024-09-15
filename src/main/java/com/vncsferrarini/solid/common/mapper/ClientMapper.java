package com.vncsferrarini.solid.common.mapper;

import com.vncsferrarini.solid.domain.model.Client;
import com.vncsferrarini.solid.web.dto.ClientDto;
import org.mapstruct.Mapper;

@Mapper
public interface ClientMapper {

    Client toDomain(ClientDto clientDto);

    ClientDto fromDomain(Client client);

}

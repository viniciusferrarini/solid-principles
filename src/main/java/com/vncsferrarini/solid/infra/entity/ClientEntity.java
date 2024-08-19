package com.vncsferrarini.solid.infra.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Builder
@Document
@RequiredArgsConstructor
public class ClientEntity {

    @Id
    private final String id;
    private final String name;

}

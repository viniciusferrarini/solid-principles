package com.vncsferrarini.solid.infra.data;

import com.vncsferrarini.solid.infra.entity.ClientEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientData extends MongoRepository<ClientEntity, String> {
}

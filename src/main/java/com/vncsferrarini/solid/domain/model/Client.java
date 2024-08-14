package com.vncsferrarini.solid.domain.model;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Client {

    private final long id;
    private final String name;
    private final String email;
    private final String document;
    private final String phoneNumber;

}

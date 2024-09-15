package com.vncsferrarini.solid.web.dto;

public record ClientDto(
        String id,
        String name,
        String email,
        String document,
        String phoneNumber) { }

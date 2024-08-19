package com.vncsferrarini.solid.web.dto;

import lombok.Builder;

@Builder
public record ClientDto(
        String id,
        String name,
        String email,
        String document,
        String phoneNumber) { }

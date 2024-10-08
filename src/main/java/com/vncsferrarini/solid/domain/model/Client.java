package com.vncsferrarini.solid.domain.model;

import lombok.Builder;

@Builder
public record Client(
        String id,
        String name,
        String email,
        String document,
        String phoneNumber) { }

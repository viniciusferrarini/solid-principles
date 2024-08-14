package com.vncsferrarini.solid.domain.model;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public abstract class Room {

    private final long id;
    private final String number;
    private final double price;
    private final boolean isAvailable;
    private final int capacity;

}

package com.vncsferrarini.solid.domain.model;

import lombok.RequiredArgsConstructor;

import java.time.Instant;

@RequiredArgsConstructor
public class Reservation {

    private final String id;
    private final Client client;
    private final Room room;
    private final Instant checkIn;
    private final Instant checkOut;

}

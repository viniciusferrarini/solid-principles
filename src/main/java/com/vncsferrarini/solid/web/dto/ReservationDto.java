package com.vncsferrarini.solid.web.dto;

import com.vncsferrarini.solid.domain.model.Reservation;

import java.time.Instant;

public record ReservationDto(String id, RoomDto room, ClientDto clientDto, Instant checkIn, Instant checkOut) {

    public Reservation create(final Reservation domain) {
        return null;
    }
}

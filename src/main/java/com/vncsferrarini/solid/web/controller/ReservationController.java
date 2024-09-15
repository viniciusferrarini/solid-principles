package com.vncsferrarini.solid.web.controller;

import com.vncsferrarini.solid.application.usecase.ReservationUseCase;
import com.vncsferrarini.solid.common.mapper.ReservationMapper;
import com.vncsferrarini.solid.web.dto.ReservationDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/reservations")
public class ReservationController {

    private final ReservationUseCase reservationUseCase;
    private final ReservationMapper reservationDtoMapper;

    @PostMapping
    public ReservationDto create(@RequestBody final ReservationDto reservationDto) {
        return reservationDtoMapper.fromDomain(reservationUseCase.create(reservationDtoMapper.toDomain(reservationDto)));
    }

}

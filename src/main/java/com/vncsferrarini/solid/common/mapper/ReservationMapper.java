package com.vncsferrarini.solid.common.mapper;

import com.vncsferrarini.solid.domain.model.Reservation;
import com.vncsferrarini.solid.web.dto.ReservationDto;
import org.mapstruct.Mapper;

@Mapper
public interface ReservationMapper {

    Reservation toDomain(ReservationDto reservationDto);

    ReservationDto fromDomain(Reservation reservation);

}

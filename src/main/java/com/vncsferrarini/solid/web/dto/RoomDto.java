package com.vncsferrarini.solid.web.dto;

import com.vncsferrarini.solid.common.enumeration.RoomType;

public record RoomDto(String id, int number, double price, boolean isAvailable, int capacity, RoomType roomType) {

}
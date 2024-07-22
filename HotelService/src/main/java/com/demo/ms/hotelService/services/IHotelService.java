package com.demo.ms.hotelService.services;

import java.util.List;

import com.demo.ms.hotelService.entities.Hotel;

public interface IHotelService {

	Hotel save(Hotel user);

	List<Hotel> getAllHotels();

	Hotel getUserById(String id);

}

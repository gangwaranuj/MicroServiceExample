package com.demo.ms.hotelService.services.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.ms.hotelService.entities.Hotel;
import com.demo.ms.hotelService.exceptions.ResourceNotFoundException;
import com.demo.ms.hotelService.repository.IHotelRepository;
import com.demo.ms.hotelService.services.IHotelService;

@Service
public class HotelServiceImpl implements IHotelService{
	
	@Autowired
	private IHotelRepository repo;

	@Override
	public Hotel save(Hotel hotel) {
		String randomUserId = UUID.randomUUID().toString();
		hotel.setId(randomUserId);
		return repo.save(hotel);
	}

	@Override
	public List<Hotel> getAllHotels() {
		return repo.findAll();
	}

	@Override
	public Hotel getUserById(String id) {
		return repo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Hotel with given id is not found on server"));
	}
	

}

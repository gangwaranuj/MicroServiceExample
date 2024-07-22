package com.demo.ms.hotelService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.ms.hotelService.entities.Hotel;
import com.demo.ms.hotelService.services.IHotelService;

@RestController
@RequestMapping("/hotel")
public class HotelController {

	
	@Autowired
	private IHotelService service;
	
	@PostMapping
	public ResponseEntity<Hotel> createHotel(@RequestBody Hotel user) {
		Hotel createUser = service.save(user);
		return ResponseEntity.status(HttpStatus.CREATED).body(createUser);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Hotel> findHotelById(@PathVariable String id) {
		Hotel user = service.getUserById(id);
		return ResponseEntity.status(HttpStatus.FOUND).body(user);
	}
	
	@GetMapping
	public ResponseEntity<List<Hotel>> getAllHotels() {
		List<Hotel> user = service.getAllHotels();
		return ResponseEntity.ok(user);
	}
}

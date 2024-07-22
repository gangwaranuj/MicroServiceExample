package com.demo.ms.ratingservice.controllers;

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

import com.demo.ms.ratingservice.entities.Rating;
import com.demo.ms.ratingservice.services.IRatingService;

@RestController
@RequestMapping("/ratings")
public class RatingController {

	@Autowired
	private IRatingService service;

	@PostMapping
	public ResponseEntity<Rating> createUser(@RequestBody Rating rating) {
		Rating create = service.save(rating);
		return ResponseEntity.status(HttpStatus.CREATED).body(create);
	}

	@GetMapping("users/{id}")
	public ResponseEntity<List<Rating>> findRatingByUserId(@PathVariable String id) {
		List<Rating> ratings = service.getRatingByUserId(id);
		return ResponseEntity.ok(ratings);
	}

	@GetMapping("hotels/{hotelId}")
	public ResponseEntity<List<Rating>> findRatingByHotelId(@PathVariable String hotelId) {
		List<Rating> ratings = service.getRatingByHotelId(hotelId);
		return ResponseEntity.ok(ratings);
	}

	@GetMapping
	public ResponseEntity<List<Rating>> getAllRatings() {
		List<Rating> ratings = service.getAllRatings();
		return ResponseEntity.ok(ratings);
	}
}
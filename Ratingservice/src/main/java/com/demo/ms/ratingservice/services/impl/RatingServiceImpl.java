package com.demo.ms.ratingservice.services.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.ms.ratingservice.entities.Rating;
import com.demo.ms.ratingservice.repositories.IRatingRepository;
import com.demo.ms.ratingservice.services.IRatingService;

@Service
public class RatingServiceImpl implements IRatingService {
	
	@Autowired
	private IRatingRepository repo;

	@Override
	public Rating save(Rating rating) {
		String randomUserId = UUID.randomUUID().toString();
		rating.setRatingId(randomUserId);
		System.out.println("request body"+ rating.toString());
		// TODO Auto-generated method stub.
		return repo.save(rating);
	}

	@Override
	public List<Rating> getAllRatings() {
		return repo.findAll();
	}

	@Override
	public List<Rating> getRatingByUserId(String userId) {
		return repo.findByUserId(userId);
	}

	@Override
	public List<Rating> getRatingByHotelId(String hotelId) {
		return repo.findByHotelId(hotelId);
	}

}

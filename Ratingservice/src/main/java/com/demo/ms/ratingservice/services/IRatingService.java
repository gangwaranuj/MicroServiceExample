package com.demo.ms.ratingservice.services;

import java.util.List;

import com.demo.ms.ratingservice.entities.Rating;

public interface IRatingService {

	Rating save(Rating user);
	List<Rating> getAllRatings();
	List<Rating> getRatingByUserId(String userId);
	List<Rating> getRatingByHotelId(String hotel);
}

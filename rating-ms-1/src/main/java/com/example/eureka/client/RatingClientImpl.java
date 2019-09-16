package com.example.eureka.client;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.eureka.domain.Rating;
import com.example.eureka.repo.RatingRepository;

public class RatingClientImpl implements RatingClient {

	@Autowired
	RatingRepository ratingRepository;
	@Override
	public List<Rating> getRating() {
		// TODO Auto-generated method stub
		return ratingRepository.findAll();
	}

	@Override
	public Rating addRating(Rating rating) {
		// TODO Auto-generated method stub
		 return ratingRepository.save(rating);
		 
	}

	@Override
	public Rating updateRating(Rating rating) {
		// TODO Auto-generated method stub
		return ratingRepository.save(rating);
	}

	public Rating getRatingByBookId(String id) {
		
		return ratingRepository.findById(id);
		
	}
}
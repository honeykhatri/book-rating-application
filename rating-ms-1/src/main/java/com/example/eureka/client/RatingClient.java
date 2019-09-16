package com.example.eureka.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;

import com.example.eureka.domain.Rating;

@FeignClient("ratings")
public interface RatingClient {

	
	List<Rating> getRating();

	
	Rating addRating(Rating rating);

	
	Rating updateRating(Rating rating);
}

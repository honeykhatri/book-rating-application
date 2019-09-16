package com.example.eureka.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.eureka.domain.Rating;

@Repository
public interface RatingRepository extends MongoRepository<Rating,String> {

}

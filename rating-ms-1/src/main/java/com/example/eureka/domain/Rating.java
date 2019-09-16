package com.example.eureka.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Rating {
	@Id
 private String ratedId;
 private String bookId;
 private String stars;
public String getRatedId() {
	return ratedId;
}
public void setRatedId(String ratedId) {
	this.ratedId = ratedId;
}
public String getBookId() {
	return bookId;
}
public void setBookId(String bookId) {
	this.bookId = bookId;
}
public String getStars() {
	return stars;
}
public void setStars(String stars) {
	this.stars = stars;
}
 
}

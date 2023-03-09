package com.Icwd.user.service;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.Icwd.user.service.entities.Rating;
import com.Icwd.user.service.external.services.RatingService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

@SpringBootTest
class UserServiceApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	private RatingService ratingService;


	@Test
	void createRating() {
		Rating rating = Rating.builder().rating(10).userId("").hotelId("").feedback("goodd").build();
		ResponseEntity<Rating> rating1 = ratingService.createRating(rating);
		rating1.getStatusCode();
		System.out.println("new rating created");
	}

}

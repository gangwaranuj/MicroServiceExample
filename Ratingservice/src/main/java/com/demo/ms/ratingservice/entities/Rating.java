package com.demo.ms.ratingservice.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="user_rating")
public class Rating {
	
	@Id
	@Column(name= "rating_id")
	private String ratingId;
	
	@Column(name= "userId")
	private String userId;

	@Column(name= "hotelId")
	private String hotelId;
	
	@Column(name= "rating")
	private int rating;

	@Column(name= "feedback")
	private String feedback;
}


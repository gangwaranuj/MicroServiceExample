package com.demo.ms.hotelService.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="hotels")
public class Hotel {
	@Id
	@Column(name= "id")
	private String id;
	

	@Column(name= "name",length = 20)
	private String name;
	

	@Column(name= "email")
	private String hotel_email;
	
	@Column(name= "location")
	private String location;
	

	@Column(name= "about")
	private String about;
	
	

}

package com.demo.ms.hotelService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.ms.hotelService.entities.Hotel;

@Repository
public interface IHotelRepository  extends JpaRepository<Hotel, String>{

}

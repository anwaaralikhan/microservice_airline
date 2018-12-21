package com.dc.microservice.airline.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dc.microservice.airline.entity.Airline;

@Repository
public interface AirlineRepository extends CrudRepository<Airline, Long>{
	Airline findByAirlineNumber(String airlineNumber);
}

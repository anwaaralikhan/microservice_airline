package com.dc.microservice.airline.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "AIRLINE")
public class Airline {

	@Id
	@Column(name = "AIRLINE_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(name = "NAME")
	private String name;
	@Column(name = "AIRLINE_NUMBER")
	private String airlineNumber;
	@Column(name = "SEAT_INFO")
	private String seatInfo;

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAirlineNumber() {
		return airlineNumber;
	}
	public void setAirlineNumber(String airlineNumber) {
		this.airlineNumber = airlineNumber;
	}
	public String getSeatInfo() {
		return seatInfo;
	}
	public void setSeatInfo(String seatInfo) {
		this.seatInfo = seatInfo;
	}

}

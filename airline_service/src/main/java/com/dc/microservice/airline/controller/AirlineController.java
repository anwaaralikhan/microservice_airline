package com.dc.microservice.airline.controller;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dc.microservice.airline.entity.Airline;
import com.dc.microservice.airline.repo.AirlineRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


/**
 * @author Anwar Mehmood (Digitalchemist)
 */
@RestController
@RequestMapping(value="/airlines")
@Api(value="airlines", description = "Data service operations on airlines", tags=("airlines"))
public class AirlineController {
    
	@Autowired
    private AirlineRepository airlineRepository;

    @RequestMapping(method = RequestMethod.GET)
    @ApiOperation(value="Get All Airlines", notes="Gets all Airlines in the system", nickname="getAirlines")
    public List<Airline> findAll(@RequestParam(name="airlineNumber", required = false)String airlineNumber){
        if(StringUtils.isNotEmpty(airlineNumber)){
            return Collections.singletonList(this.airlineRepository.findByAirlineNumber(airlineNumber));
        }
        return (List<Airline>) this.airlineRepository.findAll();
    }

    @RequestMapping(value="/{id}", method = RequestMethod.GET)
    @ApiOperation(value="Get Airline", notes="Gets a single Airline based on its unique id", nickname = "getAirline")
    public Airline findOne(@PathVariable("id")long id){
    	Optional<Airline> response = this.airlineRepository.findById(id);
    	if(response.isPresent())
    		return response.get();
    	return null;
    }
}

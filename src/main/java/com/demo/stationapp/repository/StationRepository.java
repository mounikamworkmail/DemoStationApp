package com.demo.stationapp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.demo.stationapp.entity.Station;

@Repository
public interface StationRepository extends CrudRepository<Station, String> {

	public Station findByStationId(String stationId);
	
}

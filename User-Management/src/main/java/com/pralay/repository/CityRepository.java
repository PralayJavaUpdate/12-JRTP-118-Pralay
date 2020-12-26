package com.pralay.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pralay.entity.City;

public interface CityRepository extends JpaRepository<City, Serializable>{
	List<City> findByCityId(Integer stateId);

	List<City> findByStateId(Integer stateId);
}

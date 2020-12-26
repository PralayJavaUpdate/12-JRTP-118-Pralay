package com.pralay.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pralay.entity.City;
import com.pralay.entity.Country;

public interface CountryRepository extends JpaRepository<City, Serializable>{
	List<Country> findByCountryId(Integer stateId);
}

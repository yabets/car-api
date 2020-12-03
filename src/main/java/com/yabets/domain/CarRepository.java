package com.yabets.domain;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


public interface CarRepository extends CrudRepository<Car, Long> {

	// Fetch car by brand
	List<Car> findByBrand(String brand);
	
	// Fetch car by brand or color
	List<Car> findByBrandOrColor(String brand, String color);
	
	// Fetch car by brand and sort by year
	List<Car> findByBrandOrderByYearAsc(String brand);
	
	// Fetch car by brand using SQL
	@Query("select c from Car c where c.color = ?1")
	List<Car> findByColor(String color);
}

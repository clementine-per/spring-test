package com.example.sbjdbc.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.sbjdbc.model.City;

@Repository
public interface CityRepository extends CrudRepository<City, Long> {

}

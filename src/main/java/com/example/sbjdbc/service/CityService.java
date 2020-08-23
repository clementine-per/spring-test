package com.example.sbjdbc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sbjdbc.model.City;
import com.example.sbjdbc.repository.CityRepository;

@Service
public class CityService implements ICityService {

    @Autowired
    private CityRepository repository;

    @Override
    public List<City> findAll() {

    	List<City> cities = (List<City>) repository.findAll();

        return cities;
    }
}

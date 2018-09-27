package org.lq.service;

import java.util.List;

import org.lq.pojo.City;

public interface CityService {

	
	public City searchCity(Integer id);
	
	List<City> getPage(Integer page, Integer size);
}

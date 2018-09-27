package org.lq.service.impl;

import java.util.List;

import org.lq.mapper.CityMapper;
import org.lq.pojo.City;
import org.lq.pojo.CityExample;
import org.lq.service.CityService;

import com.github.pagehelper.PageHelper;

public class CityServiceImpl implements CityService {

	
	private CityMapper cityMapper;
		
	
	public CityMapper getCityMapper() {
		return cityMapper;
	}
	
	
	public void setCityMapper(CityMapper cityMapper) {
		this.cityMapper = cityMapper;
	}

	@Override
	public City searchCity(Integer id) {
		
		return cityMapper.selectByPrimaryKey(id);
	}
	
	public List<City> getPage(Integer page, Integer size){
		CityExample example = new CityExample();
		PageHelper.startPage(page,size);
		List<City> list = cityMapper.selectByExample(example);
		
		return list;
	}

}

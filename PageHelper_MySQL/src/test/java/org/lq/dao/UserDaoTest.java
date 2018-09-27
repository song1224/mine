package org.lq.dao;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.lq.pojo.City;
import org.lq.service.CityService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserDaoTest {
	
	private ApplicationContext ctx;
	
	@Before
	public void init() {
		
		ctx = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
	}
	
	
	@Test
	public void test1() {
		CityService cityService = ctx.getBean(CityService.class);
		
		City city = cityService.searchCity(1);
		
		System.out.println("city is "+city);
	}
	

	@Test
	public void test2() {
		CityService cityService = ctx.getBean(CityService.class);
		
		List<City> list = cityService.getPage(4, 5);
		for(City city: list) {
			System.out.println("city is "+city);
		}
	}
	
}

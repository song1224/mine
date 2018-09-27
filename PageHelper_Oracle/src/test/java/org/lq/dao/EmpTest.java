package org.lq.dao;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.lq.pojo.Emp;
import org.lq.service.EmpService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpTest {
	
	private ApplicationContext ctx;
	
	@Before
	public void init() {
		
		ctx = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
	}
	@Test
	public void testGetPage() {
		System.out.println(ClassLoader.getSystemResource("spring/applicationContext.xml").getPath());
		EmpService service = ctx.getBean(EmpService.class);
		List<Emp> list = service.getPage(1, 5);
		
		for(Emp emp :list) {
			System.out.println(emp);
		}
	}
	
}

package org.lq.service;

import java.util.List;

import org.lq.pojo.Emp;

public interface EmpService {
	
	List<Emp> getPage(Integer page,Integer size);
}

package org.lq.service.impl;

import java.util.List;

import org.lq.mapper.EmpMapper;
import org.lq.pojo.Emp;
import org.lq.pojo.EmpExample;
import org.lq.service.EmpService;

import com.github.pagehelper.PageHelper;

public class EmpServiceImpl implements EmpService {

	EmpMapper empMapper;
	
	
	public EmpMapper getEmpMapper() {
		return empMapper;
	}


	public void setEmpMapper(EmpMapper empMapper) {
		this.empMapper = empMapper;
	}


	@Override
	public List<Emp> getPage(Integer page, Integer size) {
		// TODO Auto-generated method stub
		PageHelper.startPage(page, size);
		EmpExample example = new EmpExample();
		List<Emp> list = empMapper.selectByExample(example);
		
		
		return list;
	}

}

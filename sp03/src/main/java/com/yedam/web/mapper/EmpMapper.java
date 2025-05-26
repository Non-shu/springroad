package com.yedam.web.mapper;

import java.util.List;
import java.util.Map;

import com.yedam.web.model.Employees;
import com.yedam.web.model.SearchVO;

public interface EmpMapper {
	
	List<Employees> findAll(SearchVO search);
	
	List<Map> findAlltoMap();
	
	List<Employees> getCount();
	
	int insert(Employees emp); 
	
	int updateFirstName(Employees emp);
	
	int delete (int employeeId);
	// int getCount();
}

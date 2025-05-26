package com.yedam.web;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yedam.web.mapper.EmpMapper;
import com.yedam.web.model.Employees;
import com.yedam.web.model.SearchVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:/spring/datasource-context.xml", "classpath:/spring/mybatis-context.xml"})
public class EmpMapperTest {
	
	@Autowired
	EmpMapper empMapper;
	@Test
	public void 전체조회() {
		SearchVO searchVO = new SearchVO();
//		searchVO.setDepartmentId("30");
//		searchVO.setSalary("3000");
		searchVO.setIds(Arrays.asList(100,101,102));
		empMapper.findAll(searchVO).forEach(emp->
		System.out.println(emp.getEmployeeId()+":"+emp.getFirstName()+":"+emp.getDepartmentId() ));
	}
	
//	@Test
//	public void getCount() {
//		List<Employees> result = empMapper.getCount();
//		result.forEach(emp -> System.out.println(emp.getCnt()));
//	}
	
	//@Test //등록
	public void insert() {
		Employees employee = new Employees();
		employee.setEmployeeId("300");
		employee.setLastName("권");
		employee.setEmail("a@a.a");
		employee.setHireDate("2020/01/01");
		employee.setJobId("IT_PROG");
		int result = empMapper.insert(employee);
		System.out.println(result);
	}
	
	//@Test //수정
	public void updateFirstName() {
		Employees emp = new Employees();
		emp.setEmployeeId("300");
		emp.setFirstName("동익");
		int result = empMapper.updateFirstName(emp);
		System.out.println(result);
	}
	
	//@Test //삭제
	public void delete() {
		int result = empMapper.delete(300);
		System.out.println(result);
	}
	
	//@Test
	public void insertu() { //등록
		Employees emp = Employees.builder()
				.employeeId("301")
				.lastName("이")
				.email("C@C.C")
				.jobId("IT_PROG")
				.hireDate("2020/01/01")
				.build();
		int result = empMapper.insert(emp);
		System.out.println(result);
	}
//	@Test
//	public void findAlltoMap() {
//		empMapper.findAlltoMap().forEach(emp ->
//		//VO에 담을땐 소문자로 담아냄. 이후 꺼낼땐 xml에서 따로 작업하지 않는 한 함수에 대문자로 담아야함.
//		//System.out.println(emp.get("FIRST_NAME") ));
//		System.out.println(emp.get("firstName") ));
//	}
}

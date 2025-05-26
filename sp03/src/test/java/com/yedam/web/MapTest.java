package com.yedam.web;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;


public class MapTest {
	
	@Test
	public void test01() {
		List<Map<String,String>> list = new ArrayList<>();
		//제네릭타입
		Map<String, String> map = new HashMap<>();
		map.put("first_name", "scott");
		map.put("last_name", "king");
		
		list.add(map);
		//제네릭타입 안쓸경우 주석처리한게 맞음
		//String name = (String)map.get("first_name");
		map = new HashMap<>();
		map.put("first_name", "길동");
		map.put("last_name", "홍");
		list.add(map);
		
		
		list.forEach(System.out::println);
		list.forEach(fname -> System.out.println(fname));
	}
	
	
}

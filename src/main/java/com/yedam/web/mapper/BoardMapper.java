package com.yedam.web.mapper;

import java.util.List;
import java.util.Map;

import com.yedam.web.model.Board;
import com.yedam.web.model.SearchVO;

public interface BoardMapper {
	
	List<Board> findAll(SearchVO search);
	
	List<Map> findAlltoMap();
	
	List<Board> getCount();
	
	int insert(Board board);
	
	int update (Board board);
	
	int delete (int bno);
	

}

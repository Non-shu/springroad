package com.yedam.web.work03;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yedam.web.mapper.BoardMapper;
import com.yedam.web.model.Board;
import com.yedam.web.model.SearchVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:/spring/datasource-context.xml", "classpath:/spring/mybatis-context.xml"})
public class BoardMapperTest {
	@Autowired
	BoardMapper boardMapper;
	
	@Test
	public void findAll() {
		SearchVO searchVO = new SearchVO();
		searchVO.setIds(Arrays.asList(3 ,1 ,2 ));
		boardMapper.findAll(searchVO).forEach(bod ->
		System.out.println(bod.getBno()+":"+bod.getContent()+":"+bod.getTitle()+":"+bod.getWriter() ));
	}
	
	@Test
	public void insert() {
		Board board = new Board();
		board.setBno((long) 1);
		board.setContent("스트링");
		board.setWriter("박하사탕");
		board.setTitle("나 다시 돌아갈래");
		int result = boardMapper.insert(board);
		System.out.println(result);
	}
	
	@Test
	public void update() {
		Board board = new Board();
		board.setBno((long) 1);
		board.setContent("절대 말하면 안돼");
		int result = boardMapper.update(board);
		System.out.println(result);
	}
	
	@Test
	public void delete() {
		int result = boardMapper.delete(1);
		System.out.println(result);
	}
	
}

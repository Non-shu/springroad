package com.yedam.web.model;

import java.util.List;

import lombok.Data;

@Data
public class SearchVO extends Board{
	int page;
	List<Integer> ids;
}

package com.bitcamp.web.mapper;

import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public interface Mapper {
	public int exist(Map<?,?> param); 
	
}

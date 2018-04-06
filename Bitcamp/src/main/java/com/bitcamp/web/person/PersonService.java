package com.bitcamp.web.person;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitcamp.web.common.CRUDService;
import com.bitcamp.web.mapper.Mapper;

@Service
public class PersonService {
	@Autowired Mapper mapper;
	public int exist(Map<?,?> param){
		int count = 0;
		CRUDService.Count exist = (x) -> mapper.exist(x); 
		switch (param.get("type").toString()) {
		case "member":
			count = exist.execute(param);
			break;

		default:
			break;
		}
		System.out.println("회원ID 존재여부체크"+count);
		
		return count;
		//완벽한 람다!
	}
}

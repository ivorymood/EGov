package com.bitcamp.web.person;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
		locations = {
				"classpath:META-INF/*-context.xml"
		}
)
@WebAppConfiguration
public class PersonControllerTest {
	//@Autowired ServletContext context;
	@Autowired PersonService service;
	@Test
	public void testHome() {
		Map<String,String> param = new HashMap<>();
		//String path = context.getContextPath();
		String result = "존재 ㄴㄴ";
		param.put("type", "member");
		param.put("id", "aaaa");
		
		int count = service.exist(param);
		if(count==1){
			result="존재";
		}
		assertEquals("sss", result);
	}

}

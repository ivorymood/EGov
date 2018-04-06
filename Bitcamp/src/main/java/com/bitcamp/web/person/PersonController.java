package com.bitcamp.web.person;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class PersonController {
	private static final Logger logger = LoggerFactory.getLogger(PersonController.class);
	@Autowired PersonService person;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		Map<String,String> param = new HashMap<>();
		param.put("type", "member");
		param.put("id", "aaaa");
		String result = "false";
		
		int count = person.exist(param);
		logger.info("count: "+ count);
		if(count==1){
			result="true";
		}
			model.addAttribute("exist", result );
		return "home";
	}
	
	
}

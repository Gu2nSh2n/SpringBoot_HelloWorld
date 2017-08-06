package com.atguigu.springboot.handler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;







@Controller
public class HelloIndexHandlre {
	
	@RequestMapping("/")
	public String index(){
		
		return "index";
	}
	
	@RequestMapping("/haha")
	public String hello(){
		
		return "success";
	}
	
}

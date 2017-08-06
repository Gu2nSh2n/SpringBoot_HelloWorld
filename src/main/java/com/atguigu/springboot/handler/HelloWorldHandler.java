package com.atguigu.springboot.handler;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldHandler {

	@RequestMapping("/hello01")
	public String hello01(){
		
		return "<h1>HelloWorld!</h1>";
	}
	
	@RequestMapping("/hello02")
	public List<String> hello02(){
		
		return Arrays.asList(new String[]{"昨日像那东流水"});
	}
}

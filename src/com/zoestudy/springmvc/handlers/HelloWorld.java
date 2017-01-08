package com.zoestudy.springmvc.handlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorld {

	/**
	 * Use @RequestMapping annotation to reflect the request URL
	 * The return value is resolved to exact views via resolvers. As for InternalResourceViewResolver, it will
	 * dispatcher with (prefix + returnVal + suffix)
	 * @return prefix + returnVal + suffix
	 * 
	 */
	@RequestMapping("/helloworld")
	public String hello(){
		System.out.println("Hello World!");
//		it will be redirected to "/WEB-INF/views/success.jsp"
		return "success";
	}
}

package com.zoestudy.springmvc.handlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/springmvc")
@Controller
public class SpringMVCTest {

	private static final String SUCCESS = "success";
	

	@RequestMapping(value="/testRest/{id}", method=RequestMethod.PUT)
	public String testRestPut(@PathVariable Integer id){
		System.out.println("testRest PUT: " + id);
		return SUCCESS;
	}
	
	@RequestMapping(value="/testRest/{id}", method=RequestMethod.DELETE)
	public String testRestDelete(@PathVariable Integer id){
		System.out.println("testRest DELETE: " + id);
		return SUCCESS;
	}
	
	@RequestMapping(value="/testRest", method=RequestMethod.POST)
	public String testRest(){
		System.out.println("testRest POST");
		return SUCCESS;
	}
	
	@RequestMapping(value="/testRest/{id}", method=RequestMethod.GET)
	public String testRest(@PathVariable Integer id){
		System.out.println("testRest GET: " + id);
		return SUCCESS;
	}
	
	/**
	 * @PathVariable can reflect id from URL to method parameter.
	 * @param id
	 * @return
	 */
	@RequestMapping("/testPathVariable/{id}")
	public String testPathVariable(@PathVariable("id") Integer id){
		System.out.println("testPathVariable: " + id);
		return SUCCESS;
	}
	
	@RequestMapping("/testAntPath/*/abc")
	public String testAntPath(){
		System.out.println("testAntPath");
		return SUCCESS;
	}
	
	/**
	 * You can use params and headers to reflect the request url more accurately.
	 * params and headers support basic expression:
	 *  param1
	 *  !param1
	 *  param1!=value1
	 *  {"param1=value1", "param2"}
	 * @return
	 */
	@RequestMapping(value="/testParamsAndHeaders", params={"username", "age!=10"}, headers={"Accept-Language=en-US,en;q=0.8,zh-CN;q=0.6,zh;q=0.4"})
	public String testParamsAndHeaders(){
		System.out.println("testParamesAndHeaders");
		return SUCCESS;
	}
	
	/**
	 * method attribute is Commonly used to set request method(GET/POST)
	 */
	@RequestMapping(value="/testMethod", method=RequestMethod.POST)
	public String testMethod(){
		System.out.println("testMethod!");
		return SUCCESS;
	}
	
	
	/**
	 * 1. @RequestMapping can be set for methods, as well as types
	 * 2. 
	 * a. For types: provide the initial request url info, can be seen as the root directory of the web application
	 * b. For methods: provide the detailed request url info.
	 * If @RequestMapping is not set for types, then the mapping for methods will be seen as the root directory.
	 * 
	 */
	@RequestMapping("/testRequestMapping")
	public String testRequestMapping(){
		System.out.println("testRequestMapping!");
		return SUCCESS;
	}
	
}

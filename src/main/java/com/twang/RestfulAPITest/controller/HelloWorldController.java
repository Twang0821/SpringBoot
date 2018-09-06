package com.twang.RestfulAPITest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.twang.RestfulAPITest.domain.User;
import com.twang.RestfulAPITest.service.TestService;

/**
 * @Description 测试数据操作接口
 * 		调用service层接口
 * @author Tyanao
 * @date: 2018年9月6日 上午10:51:32
 * @version 0.1
 */
@RestController
@RequestMapping(value = "/api/test")
public class HelloWorldController {
	@Autowired
	private TestService testService;
	
	@RequestMapping(value = "/userId", method = RequestMethod.GET)
	public User findByUserId(@RequestParam(value = "userId", required = true) int userId) {
		System.out.println("开始查询...");

		return testService.findUserById(userId);
		//
		
	}

}

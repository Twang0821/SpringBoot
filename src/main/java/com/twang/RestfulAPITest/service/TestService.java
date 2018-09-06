package com.twang.RestfulAPITest.service;

import com.twang.RestfulAPITest.domain.User;

/**
 * @Description service层接口
 * @author Tyanao
 * @date: 2018年9月6日 上午11:56:24
 * @version 0.1
 */
public interface TestService {

	/**
	 * 根据用户ID查询用户信息
	 * 
	 * @param userId
	 */
	User findUserById(int userId);

	/**
	 * 根据用户名字查询用户信息
	 * 
	 * @param userName
	 */
	User findUserByName(String userName);
}

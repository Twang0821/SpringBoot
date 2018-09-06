package com.twang.RestfulAPITest.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.twang.RestfulAPITest.dao.TestDao;
import com.twang.RestfulAPITest.domain.User;
import com.twang.RestfulAPITest.service.TestService;


/**
 * @Description
 * 	   service层实现类,查询数据调用dao层
 * @author Tyanao
 * @date: 2018年9月6日 上午11:58:34
 * @version 0.1
 */
@Service
public class TestServiceImpl implements TestService {
	@Autowired
	private TestDao testDao;
	
	@Override
	public User findUserById(int userId) {
		System.out.println("service层实现类。。。。");
		return testDao.findById(userId);
		
	}

	@Override
	public User findUserByName(String userName) {
		// TODO Auto-generated method stub
		return null;
	}

}

package com.twang.RestfulAPITest.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.twang.RestfulAPITest.domain.User;

/**
 * @Description dao层，用注解开发，即不需要写xml文件了，适合加单的功能
 * @author Tyanao
 * @date: 2018年9月6日 下午12:00:30
 * @version 0.1
 */
@Mapper
public interface TestDao {
	/**
	 * 根据用户ID查询用户信息
	 *
	 */
	@Select("SELECT id,username,email FROM user where id=#{userId}")
	User findById(@Param("userId") int userId);
}

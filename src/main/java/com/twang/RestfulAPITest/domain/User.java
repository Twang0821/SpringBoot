package com.twang.RestfulAPITest.domain;

import lombok.Data;

/**
 * @Description
 * 	   javabean 
 * @author Tyanao
 * @date: 2018年9月6日 上午11:51:15
 * @version 0.1
 */

@Data //注解在类上；提供类所有属性的 getting 和 setting 方法，此外还提供了equals、canEqual、hashCode、toString 方法 
public class User {
	//@Setter @Getter
	private int id;
	private String username;
	private int password;
	private String email;

	
}

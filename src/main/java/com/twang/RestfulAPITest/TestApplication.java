package com.twang.RestfulAPITest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Description
 * 	   主程序
 * @author Tyanao
 * @date: 2018年9月6日 上午10:43:51
 * @version 0.1
 */
@SpringBootApplication	//开启组件扫描和自动配置
@MapperScan("com.twang.RestfulAPITest.dao") //mapper 接口类扫描包配置
public class TestApplication 
{
    public static void main( String[] args )
    {
    	// 启动嵌入式的 Tomcat 并初始化 Spring 环境及其各 Spring 组件
        SpringApplication.run(TestApplication.class, args);
        System.out.println("程序正在运行...");
    }
}

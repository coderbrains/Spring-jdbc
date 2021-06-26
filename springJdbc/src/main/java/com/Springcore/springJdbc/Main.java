package com.Springcore.springJdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Main {

	public static void main(String[] args) {
		
		
		System.out.println("main");
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/Springcore/springjdbc/config.xml");

		JdbcTemplate jdbcTemplate = context.getBean("jdbcTemplate",JdbcTemplate.class);
		
		String q = "insert into student(name,city)values(?,?)";
		
		int i = jdbcTemplate.update(q,"Manish", "goreakothi");
		
		System.out.println("The number of rows affected : " + i);
		
	}

}

package com.Springcore.springJdbc;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.Springcore.jdbcdao.Studentdao;
import com.Springcore.jdbcdao.StudentdaoImpl;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("main");
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/Springcore/springjdbc/config.xml");

		StudentdaoImpl impl = context.getBean("studentdao",StudentdaoImpl.class);
		
		com.Springcore.jdbcdao.entities.Student student = new com.Springcore.jdbcdao.entities.Student();
		
		System.out.println("enter the name : ");
		String name = sc.nextLine();
		
		System.out.println("enter the city :");
		String city = sc.nextLine();
		
		student.setName(name);
		student.setCity(city);
		
		
		impl.insert(student);
		
		
		
		
	}

}

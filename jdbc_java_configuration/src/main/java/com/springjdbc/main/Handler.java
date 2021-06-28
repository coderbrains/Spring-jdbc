package com.springjdbc.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springjdbc.dao.Persondao;
import com.springjdbc.entities.Person;

public class Handler {

	
	public static void main(String[] a) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		
		Persondao persondao = context.getBean("persondao",Persondao.class);
		
		Person person = new Person();
		
		System.out.println();
		
//		person.setId(25);
//		person.setName("Athar");
//		person.setCity("Maharajganj");
//		person.setSalary(20000);
//		
//		int i = persondao.insert(person);
//		
//		System.out.println("no of rows inserted is : "  + i + " successfully.");
//		
	}
	
}

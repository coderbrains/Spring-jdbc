package com.spring.orm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.Studentdao;
import com.spring.orm.entities.Student;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
//        System.out.println( "H" );

		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

		Studentdao studentdao = context.getBean("studentdao", Studentdao.class);

		Student student = new Student();
		student.setId(123);
		student.setName("Awanish");
		student.setCity("siwan");
		
		studentdao.insert(student);

	}
}

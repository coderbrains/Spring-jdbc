package com.operations.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.operations.dao.Studentdao;
import com.operations.entities.Student;

public class Handler {
	
	public static void main(String[] ar) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/operations/main/config.xml");
		
		Studentdao studentdao = context.getBean("studentd",Studentdao.class);
		
//		inserting student the into the database............
//		
//		Student student = new Student();
//		student.setCity("siwan");
//		student.setId(20);
//		student.setName("Awanish kumar singh");
//		
//		int i = studentdao.insert(student);
//		System.out.println("number of rows inserted is " + i);
		
		
//		updating the student is done here.............
		
		Student student = new  Student();
		student.setCity("Gopalganj");
		student.setName("Manish kumar singh g");
		student.setId(2);
		
		int i = studentdao.update(student);
		
		System.out.println("the numbeer of rows updated is : " + i);
	
	}

}

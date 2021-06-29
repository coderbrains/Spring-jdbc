package com.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dao.Studentdao;
import com.enttities.Student;

public class Handler {
	
	public static void main(String[] s) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/main/config.xml");
		
		Studentdao studentdao = context.getBean("studentdao",Studentdao.class);

		Student student = new Student();
		
		//inserting the query.
		
//		student.setId(4545);
//		student.setName("Bhakur das");
//		student.setCity("siwan");
//		int i = studentdao.insert(student);
//		System.out.println("successfully added ...." + i);
		
		//updating a query.....
		
//		student.setId(4545);
//		student.setCity("Bablu bhawan");
//		student.setName("Jayanti Lal gada");
//		
//		int i = studentdao.update(student);
//		System.out.println("updated...");
		
		
		
		// deleting the query....
		
//		int delete = studentdao.delete(4545);
//		System.out.println("successfully deleted..");
		
		
		// getting one student at one time.....
		
//		Student student2 = studentdao.getStudent(20);
//		System.out.println(student2);
		
		//getting all the students at one time.....
		
		
		List<Student> students = studentdao.getStudents();
		
		for(Student st : students) {
			System.out.println(st);
		}
		
		
	}

}

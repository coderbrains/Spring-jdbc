package com.spring.orm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.Studentdao;
import com.spring.orm.entites.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

    	System.out.println("APP started....");
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
    	
    	Studentdao studentdao = context.getBean("studentDao",Studentdao.class);
    	
    	Student student = new Student();
    	
    	student.setCity("siwan");
    	student.setId(12);
    	student.setName("Awanish");
    	
    	int i = studentdao.insert(student);
    	System.out.println("successfully added..." + i );
    
    }
}

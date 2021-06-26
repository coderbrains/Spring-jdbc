package com.jdbc.implementation;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jdbc.dao.PersonDao;
import com.jdbc.entities.Person;

public class Main {

	public static void main(String[] a) {

		Scanner sc = new Scanner(System.in);

		System.out.println("hello world...");

		ApplicationContext context = new ClassPathXmlApplicationContext("com/jdbc/implementation/config.xml");

		PersonDao dao = context.getBean("persondao", PersonDao.class);

		Person person = context.getBean("person", Person.class);

		System.out.println("enter the id :");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("enter the name ");
		String name = sc.nextLine();
		System.out.println("enter the salary : ");
		int salary = sc.nextInt();
		sc.nextLine();
		System.out.println("enter the city :");
		String city = sc.nextLine();

		person.setId(id);
		person.setName(name);
		person.setCity(city);
		person.setSalary(salary);
	
		dao.insert(person);
	}

}

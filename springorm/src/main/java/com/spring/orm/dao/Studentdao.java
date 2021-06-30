package com.spring.orm.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.orm.entites.Student;
import com.spring.orm.interfaces.StudentIn;


public class Studentdao implements StudentIn{
	
	HibernateTemplate hibernateTemplate;

	/**
	 * @return the hibernateTemplate
	 */
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	/**
	 * @param hibernateTemplate the hibernateTemplate to set
	 */
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Transactional
	public int insert(Student student) {
		
		int save = (Integer)hibernateTemplate.save(student);
		
		return save;
	}

	public int update(Student student) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	public Student getStudent(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}

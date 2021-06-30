package com.spring.orm.dao;


import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.orm.entities.Student;

public class Studentdao{

	private HibernateTemplate hibernateTemplate;
	
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
	
	// inserting the student in one method.....

	@Transactional
	public int insert(Student student) {
		
		int save = (Integer)this.hibernateTemplate.save(student);
		
		return save;
	}

	
	
}

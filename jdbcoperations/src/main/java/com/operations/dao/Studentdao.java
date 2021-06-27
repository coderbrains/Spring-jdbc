package com.operations.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.operations.entities.Student;
import com.operations.interfaces.StudentInter;

public class Studentdao implements StudentInter{
	
	private JdbcTemplate jdbcTemplate;

	/**
	 * @return the jdbcTemplate
	 */
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	/**
	 * @param jdbcTemplate the jdbcTemplate to set
	 */
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int insert(Student student) {
		
		String q = "insert into student(id,name,city)values(?,?,?)";
		int i = jdbcTemplate.update(q,student.getId(),student.getName(),student.getCity());
		
		return i;
	}

	public int update(Student student) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
}

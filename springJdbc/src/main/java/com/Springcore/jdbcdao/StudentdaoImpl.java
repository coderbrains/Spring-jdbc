package com.Springcore.jdbcdao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.Springcore.jdbcdao.entities.Student;

public class StudentdaoImpl implements Studentdao {

	private JdbcTemplate jdbcTemplate;

	public int insert(Student student) {

		String q = "insert into student(name,city)values(?,?)";

		int i = jdbcTemplate.update(q, student.getName()	, student.getCity());

		System.out.println("The number of rows affected : " + i);

		return i;
	}

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

}

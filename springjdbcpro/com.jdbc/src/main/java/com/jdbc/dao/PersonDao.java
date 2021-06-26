package com.jdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.jdbc.entities.Person;

public class PersonDao implements PersonIn{
	
	JdbcTemplate jdbcTemplate;

	public int insert(Person person) {
		
		String q = "insert into person(id,name,salary,city)values(?,?,?,?)";
		int i = jdbcTemplate.update(q,person.getId(),person.getName(),person.getSalary(),person.getCity());
		System.out.println(i);
		return 0;
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

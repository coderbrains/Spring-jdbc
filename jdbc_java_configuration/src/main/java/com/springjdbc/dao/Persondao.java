package com.springjdbc.dao;

import java.util.List;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.springjdbc.entities.Person;
import com.springjdbc.inter.PersonIn;

@Component("persondao")
public class Persondao implements PersonIn {

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

	public int insert(Person person) {
		String q = "insert into person(id,name,salary,city)values(?,?,?,?)";
		int i = 0;
		System.out.println(jdbcTemplate);
		try {
			i = jdbcTemplate.update(q, person.getId(), person.getName(), person.getSalary(), person.getCity());

		} catch (Exception e) {
			e.printStackTrace();
		}

		return i;
	}

	public int updata(Person person) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	public Person getPerson() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Person> getPersons() {
		// TODO Auto-generated method stub
		return null;
	}

}

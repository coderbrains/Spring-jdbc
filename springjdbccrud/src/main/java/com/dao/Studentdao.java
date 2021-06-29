package com.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.enttities.Student;
import com.interfaces.StudentIn;

public class Studentdao implements StudentIn{

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

	
	//inserting the student query is exucueted here..
	
	public int insert(Student student) {
		
		String q = "insert into student(id,name,city)values(?,?,?)";
		
		int i = jdbcTemplate.update(q,student.getId(),student.getName(),student.getCity());
		
		return i;
	}

	public int delete(int id) {
		
		String q = "delete from student where id = ?";
		int update = jdbcTemplate.update(q,id);
		return update;
	}

	public int update(Student student) {
		String q = "update student set name = ? , city = ? where id = ?";
		int i = jdbcTemplate.update(q,student.getName(),student.getCity(),student.getId());
		return i;
	}

	public Student getStudent(int id) {
		
		Student student = new Student();
		
		String q = "select * from student where id = ?";
		
		RowMapper<Student> rowMapper = new RowmapperImpl();
		
		Student student2 = jdbcTemplate.queryForObject(q, rowMapper, id);
		
		return student2;
	}

	public List<Student> getStudents() {
		
		String q = "select * from student";
		
		RowMapper<Student> rowMapper = new RowmapperImpl();
		
		List<Student> query = jdbcTemplate.query(q, rowMapper);
		
		return query;
	}
	
	
}

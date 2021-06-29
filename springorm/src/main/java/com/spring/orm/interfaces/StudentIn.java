package com.spring.orm.interfaces;

import java.util.List;

import com.spring.orm.entites.Student;

public interface StudentIn {
	
	public int insert(Student student);
	public int update(Student student);
	public int delete(int id);
	public Student getStudent(int id);
	public List<Student> getStudents();

}

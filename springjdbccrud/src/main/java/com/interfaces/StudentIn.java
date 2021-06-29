package com.interfaces;

import java.util.List;

import com.enttities.Student;

public interface StudentIn {
	

	
	public int insert(Student student);
	public int delete(int id);
	public int update(Student student);
	public Student getStudent(int id);
	public List<Student> getStudents();
	
	

}

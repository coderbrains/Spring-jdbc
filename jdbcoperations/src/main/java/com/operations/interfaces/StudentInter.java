package com.operations.interfaces;

import java.util.List;

import com.operations.entities.Student;

public interface StudentInter {
	
	public int insert(Student student);
	public int update(Student student);
	public int delete(int id);
	public Student getStudent(int id);
	public List<Student> getStudents();
	

}

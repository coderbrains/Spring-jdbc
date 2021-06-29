package com.spring.orm.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student_details")
public class Student {

	@Id
	@Column(name = "student_id")
	private int id;
	
	@Column(name="student_name",length = 100)
	private String name;
	
	@Column(name="student_city",length = 200)
	private String city;
	
	
	public Student() {
	
		
	}
	

	public Student(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}





	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}


	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
	
	
	
	
	
	
	
}

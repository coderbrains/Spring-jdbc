package com.springjdbc.inter;

import java.util.List;

import com.springjdbc.entities.Person;

public interface PersonIn {
	
	public int insert(Person person);
	public int updata( Person person);
	public int delete(int id);
	public Person getPerson();
	public List< Person> getPersons();
	

}

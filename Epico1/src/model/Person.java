package model;

import java.util.Date;

public abstract class Person {
	
	private String name;
	private Date dataOfBirth;
	
	public Person() {
		
	}

	public Person (String name,Date dateOfBirth) {
		setName(name);
		setDataOfBirth(dateOfBirth);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDataOfBirth() {
		return dataOfBirth;
	}

	public void setDataOfBirth(Date dataOfBirth) {
		this.dataOfBirth = dataOfBirth;
	}
}

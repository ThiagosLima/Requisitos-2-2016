package model;

import java.util.Date;

public abstract class Person {
	
	private String name;
	private String dataOfBirth;
	
	public Person() {
		
	}

	Person (String name,String dateOfBirth) {
		setName(name);
		setDataOfBirth(dateOfBirth);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDataOfBirth() {
		return dataOfBirth;
	}

	public void setDataOfBirth(String dataOfBirth) {
		this.dataOfBirth = dataOfBirth;
	}
}

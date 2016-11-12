package model;

import java.util.Date;

public abstract class Person {
	
	private String name;
	private String dataOfBirth;
	private Character typeOfUser;
	private String login;
	private String password;
	
	public Person() {
		
	}

	Person (String name,String dateOfBirth , Character typeOfUser) {
		setName(name);
		setDataOfBirth(dateOfBirth);
		setTypeOfUser(typeOfUser);
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

	public Character getTypeOfUser() {
		return typeOfUser;
	}

	public void setTypeOfUser(Character typeOfUser) {
		this.typeOfUser = typeOfUser;
	}
	
	
}

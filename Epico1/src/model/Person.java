package model;

import java.util.Date;

public abstract class Person {
	
	private String name;
	private String sex;
	private Date dataOfBirth;
	
	public Person() {
		
	}

	public Person (String name,String sex,Date dateOfBirth) {
		setName(name);
		setSex(sex);
		setDataOfBirth(dateOfBirth);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Date getDataOfBirth() {
		return dataOfBirth;
	}

	public void setDataOfBirth(Date dataOfBirth) {
		this.dataOfBirth = dataOfBirth;
	}
}

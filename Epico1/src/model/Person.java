package model;


public class Person {
	
	protected String name;
	private String dataOfBirth;

	Person (String name,String dataOfBirth2 ) {
		setName(name);
		setDataOfBirth(dataOfBirth2);
		
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

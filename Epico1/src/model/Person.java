package model;


public abstract class Person {
	
	protected static String name;
	protected static String dataOfBirth;

	Person (String name,String dataOfBirth) {
		setName(name);
		setDataOfBirth(dataOfBirth);
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

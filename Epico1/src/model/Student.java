package model;

public class Student extends Person{
	
	String letterClass;
	String room; // sala
	String registration; // Matricula
	String turn;
	String year;
	String modalityCourse; //Modalidade de curso
	String scholarship; //Bolsista

	public Student () {
		
	}

	public Student (String letterClass,String room,String registration,String turn,String year,
					String modalityCourse,String scholarship) {
		super();
		setLetterClass(letterClass);
		setRoom(room);
		setRegistration(registration);
		setTurn(turn);
		setYear(year);
		setModalityCourse(modalityCourse);
		setScholarship(scholarship);
	}

	public String getLetterClass() {
		return letterClass;
	}

	public void setLetterClass(String letterClass) {
		this.letterClass = letterClass;
	}

	public String getTurn() {
		return turn;
	}

	public void setTurn(String turn) {
		this.turn = turn;
	}

	public String getRoom() {
		return room;
	}

	public void setRoom(String room) {
		this.room = room;
	}

	public String getRegistration() {
		return registration;
	}

	public void setRegistration(String registration) {
		this.registration = registration;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getModalityCourse() {
		return modalityCourse;
	}

	public void setModalityCourse(String modalityCourse) {
		this.modalityCourse = modalityCourse;
	}
	
	public String getScholarship() {
		return scholarship;
	}

	public void setScholarship(String scholarship) {
		this.scholarship = scholarship;
	}
}

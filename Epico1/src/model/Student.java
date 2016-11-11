package model;

public class Student extends Person{
	
	String letterClass;
	String room; // sala
	String registration; // Matricula
	String turn;
	String serie;
	String modalityCourse; //Modalidade de curso
	
	public Student () {
		
	}

	public Student (String letterClass,String room,String registration,String turn,String serie,
					String modalityCourse) {
		setLetterClass(letterClass);
		setRoom(room);
		setRegistration(registration);
		setTurn(turn);
		setSerie(serie);
		setModalityCourse(modalityCourse);
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

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public String getModalityCourse() {
		return modalityCourse;
	}

	public void setModalityCourse(String modalityCourse) {
		this.modalityCourse = modalityCourse;
	}
}

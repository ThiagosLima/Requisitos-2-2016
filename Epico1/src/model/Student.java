package model;

import java.util.Date;

public class Student extends Person {
	
	private String letterClass;
	private String room; // sala
	private String registration; // Matricula
	private String turn;
	private String year;
	private String modalityCourse; //Modalidade de curso
	private String scholarship; //Bolsista
	
	public Student(String nameStudent, String dataOfBirth,String letterClass,String room,String registration,
			String turn, String year,String modalityCourse,String scholarShip) {
		super(name, dataOfBirth);
		setLetterClass(letterClass);
		setDataOfBirth(dataOfBirth);
		setRoom(room);
		setRegistration(registration);
		setTurn(turn);
		setYear(year);
		setModalityCourse(modalityCourse);
		setScholarship(scholarShip);
	}
	
	public String getLetterClass() {
		return letterClass;
	}
	public void setLetterClass(String letterClass) {
		this.letterClass = letterClass;
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
	public String getTurn() {
		return turn;
	}
	public void setTurn(String turn) {
		this.turn = turn;
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

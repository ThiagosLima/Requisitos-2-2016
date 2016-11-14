package model;

import java.util.Date;

public class Student extends Person{
	
	private Character letterClass;
	private Integer room; // sala
	private Integer registration; // Matricula
	private String turn;
	private Integer year;
	private String modalityCourse; //Modalidade de curso
	private Boolean scholarship; //Bolsista
	
	
	public Student(String name, String dataOfBirth,Character letterClass, Integer room, Integer registration, String turn, Integer year,
			String modalityCourse ,Boolean scholarship) {
		super(name, dataOfBirth);
		this.letterClass = letterClass;
		this.room = room;
		this.registration = registration;
		this.turn = turn;
		this.year = year;
		this.modalityCourse = modalityCourse;
		this.scholarship = scholarship;
	}

	public Character getLetterClass() {
		return letterClass;
	}

	public void setLetterClass(Character letterClass) {
		this.letterClass = letterClass;
	}

	public Integer getRoom() {
		return room;
	}

	public void setRoom(Integer room) {
		this.room = room;
	}

	public Integer getRegistration() {
		return registration;
	}

	public void setRegistration(Integer registration) {
		this.registration = registration;
	}

	public String getTurn() {
		return turn;
	}

	public void setTurn(String turn) {
		this.turn = turn;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getModalityCourse() {
		return modalityCourse;
	}

	public void setModalityCourse(String modalityCourse) {
		this.modalityCourse = modalityCourse;
	}

	public Boolean getScholarship() {
		return scholarship;
	}

	public void setScholarship(Boolean scholarship) {
		this.scholarship = scholarship;
	}
	
	

	
}

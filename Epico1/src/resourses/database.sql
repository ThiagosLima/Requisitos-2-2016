CREATE DATABASE IF NOT EXISTS cef;
USE cef;

CREATE TABLE  IF NOT EXISTS Student (
	registration VARCHAR(10) PRIMARY KEY NOT NULL,
	name VARCHAR(42) NOT NULL,
	dateOfBirth VARCHAR(10),
	letterClass VARCHAR(1) NOT NULL ,
	room VARCHAR(1) NOT NULL ,
	turn VARCHAR(1) NOT NULL,
	year VARCHAR(1) NOT NULL,
	modalityCourse VARCHAR(6) NOT NULL,
	scholarshio VARCHAR(1) NOT NULL
);

CREATE TABLE IF NOT EXISTS Responsible (
	idResponsabile INT UNSIGNED PRIMARY KEY auto_increment,
	passoword VARCHAR(10) ,
	name VARCHAR(42),
	dateOfBirth VARCHAR(10),
	idStudent INT UNSIGNED,
FOREIGN KEY (registration) REFERENCES Student(registration)
)


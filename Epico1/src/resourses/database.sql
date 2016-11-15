CREATE DATABASE if not exists cef;
USE cef;

CREATE TABLE  IF NOT EXISTS Student (
idStudent INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
name VARCHAR(42) NOT NULL,
dateOfBirth VARCHAR(10),
letterClass VARCHAR(1) NOT NULL ,
room VARCHAR(1) NOT NULL ,
registration VARCHAR(10) NOT NULL,
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
FOREIGN KEY (idStudent) REFERENCES Student(idStudent)
)


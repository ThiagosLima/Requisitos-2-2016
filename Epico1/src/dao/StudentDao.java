package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import model.Student;

public class StudentDao extends ConnectionFactory{
	
	public static void insertStudent(Student student){
		try {
			Connection connection = getConexao();
			PreparedStatement pstm = connection.
					prepareStatement("INSERT INTO Student (nameStudent,dateOfBirth,"
									+ "letterClass,room,registration,turn,year,modalityCourse"
									+ "scholarship) VALUES (?,?,?,?,?,?,?,?,?,0,false)");
			
			pstm.setString(1, student.getName());
			pstm.setString(2, student.getDataOfBirth());
			pstm.setString(3, student.getLetterClass());
			pstm.setString(4, student.getRoom());
			pstm.setString(5, student.getRegistration());
			pstm.setString(6, student.getTurn());
			pstm.setString(7, student.getYear());
			pstm.setString(8, student.getModalityCourse());
			pstm.setString(9, student.getScholarship());
			pstm.execute();
			pstm.close();
			connection.close();
				
		} catch (Exception e) {
			System.out.println("Erro ao adicionar aluno");
			e.printStackTrace();
		}
	}

}

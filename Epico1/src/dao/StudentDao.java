package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import model.Student;

public class StudentDao extends ConnectionFactory{
	
	public static void insertStudent(Student student){
		
		try {
			
			Connection connection = getConexao();
			System.out.println("TERCEIRA PARTE");
			PreparedStatement pstm = connection.
					prepareStatement("INSERT INTO Student(registration,name,dateOfBirth,"
									+ "letterClass,room,turn,year,modalityCourse,"
									+ "scholarship) VALUES (?,?,?,?,?,?,?,?,?,0,false)");
			
			System.out.println("QUARTA PARTE!");
			pstm.setString(1, student.getRegistration());
			pstm.setString(2, student.getName());
			pstm.setString(3, student.getDataOfBirth());
			pstm.setString(4, student.getLetterClass());
			pstm.setString(5, student.getRoom());
			pstm.setString(6, student.getTurn());
			pstm.setString(7, student.getYear());
			pstm.setString(8, student.getModalityCourse());
			pstm.setString(9, student.getScholarship());
			System.out.println("QUINTA PARTE");
			pstm.execute();
			pstm.close();
			connection.close();
			
				
		} catch (Exception e) {
			System.out.println("Erro ao adicionar aluno");
			e.printStackTrace();
		}
	}
}

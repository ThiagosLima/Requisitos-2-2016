package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Student;

public class StudentDao extends ConnectionFactory{
	
	private static Connection connection;
	
	public StudentDao () {
		connection = ConnectionFactory.getConexao();
	}
	
	public static void insertStudent(Student student){
		
		try {
		
			String query = "INSERT INTO Student(registration,name,dateOfBirth,letterClass,room,turn,year,modalityCourse,\n" + 
					"			scholarship) VALUES ('?','?','?','?','?','?','?','?','?');";
			PreparedStatement pstm = connection.prepareStatement(query);
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
			pstm.executeUpdate();
			pstm.close();			
				
		} catch (SQLException e) {
			System.out.println("Erro ao adicionar aluno");
			e.printStackTrace();
		}
	}
}

package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	public static String status  = "Não conectou ...";
	
	public ConnectionFactory () {
		
	}
	
	public static java.sql.Connection getConnectionMySQL() {
		
		Connection connection = null;
		
		try {
			String driverName = "com.mysql.jdbc.Driver"; 
			Class.forName(driverName);
			
			String serverName = "localhost";  
            String mydatabase = "mysql"; 
            String url = "jdbc:mysql://" + serverName + "/" + mydatabase;
            String username = "root";      
            String password = "req123";
 
            connection = DriverManager.getConnection(url, username, password);
            
            if (connection != null) {
                status = ("STATUS--->Conectado com sucesso!");
            } else {
                status = ("STATUS--->Não foi possivel realizar conexão");
            }
            
            return connection;
		} catch (ClassNotFoundException exception) {
			 System.out.println("O driver expecificado nao foi encontrado.");
	         return null;
		} catch (SQLException exception) {
			System.out.println("Nao foi possivel conectar ao Banco de Dados.");
            return null;
		}
	}
	
	public static String statusConection() {
		 
        return status;
    }
	
	public static boolean closeConnection() {
		 
        try {
            ConnectionFactory.getConnectionMySQL().close();
            return true;
        } catch (SQLException exception) {
            return false;
        }
    }
	
	public static java.sql.Connection ReiniciarConexao() {
		 
        closeConnection();
        return ConnectionFactory.getConnectionMySQL();
    }
}

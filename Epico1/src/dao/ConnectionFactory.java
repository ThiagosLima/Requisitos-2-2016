package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

	static String status = "";
	public static synchronized Connection getConexao() {
		Connection connection = null;
		String user = "root";
		String password = "root";
		String nameDatabase = "cef";

		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/" + nameDatabase, user, password);
			status = "Connection opened";
		} catch (Exception error) {
			status = error.getMessage();
		}
		return connection;
	}
}

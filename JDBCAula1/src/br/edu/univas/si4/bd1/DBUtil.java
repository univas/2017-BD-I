package br.edu.univas.si4.bd1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

	public static Connection openConnection() throws SQLException {
		try {
			Class.forName("org.postgresql.Driver");

			String url = "jdbc:postgresql://localhost:5432/postgres";
			String username = "postgres";
			String password = "abc123";

			Connection conn = 
					DriverManager.getConnection(url, username, password);

			return conn;
		} catch (ClassNotFoundException e) {
			throw new SQLException(e);
		} 
	}
}

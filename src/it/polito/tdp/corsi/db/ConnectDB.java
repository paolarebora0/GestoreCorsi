package it.polito.tdp.corsi.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {

	public static Connection getConnection() {
		
		String jdbcURL = "jdbc:mysql://localhost/iscritticorsi?user=root&password=pr290996";
		try {
			Connection conn = DriverManager.getConnection(jdbcURL);
			return conn;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

}

package com.sp.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConfigure {
	public static String url = "jdbc:postgresql://localhost:5432/postgres";
	public static String user="postgres";
	public static String password="Qwerty@1212";
	public static Connection createDBConnection() {
		Connection con=null;
		try {
			Class.forName("org.postgresql.Driver");
			con=DriverManager.getConnection(url, user, password);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}

}

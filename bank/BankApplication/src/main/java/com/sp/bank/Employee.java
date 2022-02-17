package com.sp.bank;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.sp.db.DbConfigure;

public class Employee {
	private static int Id;
	private static String name;
	private static String email;
	private static String password;
	 static Scanner s=new Scanner(System.in);
	public static void employeeLogin() {
		System.out.println("Enter you id:");
		Id=s.nextInt();
		System.out.println("Enter you name:");
		name=s.next();
		System.out.println("Enter you email:");
		email=s.next();
		System.out.println("Enter you password:");
		password=s.next();
		try {
			Statement stmt = DbConfigure.createDBConnection().createStatement();
			ResultSet rs1= stmt.executeQuery("select * from employee"); 	
			if(Id==rs1.getInt("Id")&&0==name.compareTo(rs1.getString("name"))&&0==email.compareTo(rs1.getString("email"))&&0==password.compareTo(rs1.getString("password")))
	    		System.out.println("UR LOGIN SUCCESSFULLY");
			else
				System.out.println("UR  NOT LOGIN SUCCESSFULLY");
		} 
		// ********JDBC Code Ends here***********
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
	}
}

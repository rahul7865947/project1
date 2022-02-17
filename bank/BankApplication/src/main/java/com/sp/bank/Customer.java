package com.sp.bank;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.sp.db.DbConfigure;


public class Customer {
	private static int Id;
	private  static String name;
	private static String aadharNo;
	private static String mobileNo;
	private static String email;
	private static String city;
	private static String pincode;
	private static String address;
	private static String balance;
	
	 static Scanner s=new Scanner(System.in);
		public static void customerLogin() {
			
			System.out.println("Enter you id:");
			Id=s.nextInt();
			System.out.println("Enter you name:");
			name=s.next();
			System.out.println("Enter you aadharNo:");
			aadharNo=s.next();
			System.out.println("Enter you mobileNo:");
			mobileNo=s.next();
			System.out.println("Enter you email:");
			email=s.next();
			System.out.println("Enter you city:");
			city=s.next();
			System.out.println("Enter you pincode:");
			pincode=s.next();
			System.out.println("Enter you address:");
			address=s.next();
			System.out.println("Enter you balance:");
			balance=s.next();
			

			try {
				Statement stmt = DbConfigure.createDBConnection().createStatement();
				int no = stmt.executeUpdate("insert into customer values(" + Id + ",'" +name + "','" +aadharNo+ "','" 
				+ mobileNo+ "','"+email+"','"+city+"','"+pincode+"','"+address+"','"+balance+"')");
				System.out.println("Insert is done" + no);
			} 
			// ********JDBC Code Ends here***********
			catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
		}
	
	

}

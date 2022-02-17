package com.sp.main;

import java.util.Scanner;

import com.sp.bank.Customer;
import com.sp.bank.Employee;

public class Main {
	
public static void main(String[] args) {
		
		System.out.println("Bank Management Application");
		System.out.println("1.Employee login:");
		System.out.println("2.CustomerLogin:");
		System.out.println("3.ACCOUNT CREATION ");
		System.out.println("4.TRANSACTION TABLE:");
		System.out.println("Choose Option from 1 to 4");
		Scanner s = new Scanner(System.in);
		int choice = s.nextInt();
		switch (choice) {
		case 1:Employee.employeeLogin();
			
			break;
		case 2:Customer.customerLogin();
				break;
		
		default:
			System.out.println("choose  a choice 1-4");
		}
	}

}

package com.project.todolist;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

public class MainApp {
	public static Connection con;
	
	public static void main(String[] args) {
		try {
		Scanner sc = new Scanner(System.in);
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JavaProject", "root", "root");
		//---------------------------------------------------------------------------------------------//
		System.out.println("\t\t Welcome to To_Do_List Application");
		System.out.println("Please select an option:\n"
				+ "1. Registe\nr"
				+ "2. Login\n"
				+ "Press any other key to terminate the app\n\n");
				
		int choice = sc.nextInt();
		if(choice==1) {
			Users.registerUser();
			main(null);
		}
		else if(choice==2) {
			Users.loginUser();
			main(null);
		}
		else {
			System.out.println("Thank You..");
			System.exit(0);
		}	
	}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}

package com.project.todolist;

import java.sql.Connection;

public class Users {
	int user_id;
	String user_name;
	String user_login_name;
	String upassword;
	
	static public Connection con = MainApp.con;// recovering the connection fro the mainapp
	

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_login_name() {
		return user_login_name;
	}

	public void setUser_login_name(String user_login_name) {
		this.user_login_name = user_login_name;
	}

	public String getUpassword() {
		return upassword;
	}

	public void setUpassword(String upassword) {
		this.upassword = upassword;
	}

	public static void registerUser() {
		// TODO Auto-generated method stub
		try {
			String sql = "insert into users(user_name, login_user_name, upassword) values (?,?,?)";
			pstmt = con.prepareStatement(sql);
			System.out.println("Enter the user name : ");
			pstmt.setString(1, sc.next());
			
			System.out.println("Enter the login user name : ");
			pstmt.setString(2, sc.next());
			
			System.out.println("Enter the password : ");
			pstmt.setString(3, sc.next());
			
			int x = pstmt.executeUpdate();
			if(x>0) {
				System.out.println("User Registered. Select Login to view your account.");
			}
		}
		System.out.println();
		
	}

	public static void loginUser() {
		// TODO Auto-generated method stub
		
	}



}

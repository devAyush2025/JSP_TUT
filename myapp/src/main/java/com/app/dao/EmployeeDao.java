package com.app.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.app.model.Employee;

public class EmployeeDao {

	
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException 
	{
		
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver found");
			Connection con=DriverManager.getConnection("jdbc:mysql://192.168.100.80:3306/group025","group025","welcome");
			System.out.println("Connection established");
			return con;

		}
		
	
	public static int registerEmployee(Employee e) throws ClassNotFoundException, SQLException {
		int i =0;
				try {
				Connection con = getConnection();
				PreparedStatement pstmt = con.prepareStatement("insert into empl(username ,password,email,gender,age) values(?,?,?,?,?)");
				
				pstmt.setString(1,e.getUsername());
				pstmt.setString(2,e.getPassword());
				pstmt.setString(3,e.getEmail());
				pstmt.setString(4,e.getGender());
				pstmt.setString(5,e.getAge());
//				pstmt.setString(6,e.getTerm());
				i=pstmt.executeUpdate();
				
				}
				catch(Exception e1)
				{
					return i;
					
				}
				return i;
				
				
		
	}
	
	
	public static boolean loginEmployee(Employee e) throws SQLException, ClassNotFoundException
	{
		boolean ans=false;
		Connection con=getConnection();
		PreparedStatement pstmt = con.prepareStatement("select * from empl where username=? and password=?");
 				
				pstmt.setString(1, e.getUsername());
				pstmt.setString(2, e.getPassword());
				System.out.println("login dao ");
				
				ResultSet rs = pstmt.executeQuery();
				ans = rs.next();
				System.out.println("ans="+ans);
				return ans;

	}
	
	
	
	}


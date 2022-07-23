package com.user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import  java.sql.Statement;


import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import org.xml.sax.SAXException;
import java.sql.SQLException;

 

public class UserDBUtil implements UserService  {
	
	/** Initialize logger */
	
	
	public static final Logger log = Logger.getLogger(UserDBUtil.class.getName());
	
	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stmt=null;
	private static ResultSet rs=null;
	
	public static boolean validate(String username,String password) {
		try {
			
			con = DBConnect.getConnection();
			stmt =con.createStatement();
			
			String sql= "select * from user where username='"+username+"'and password ='"+password+"'";
			rs=stmt.executeQuery(sql);
			
			if(rs.next()) {
				isSuccess = true;
			}else {
				isSuccess = false;
			}
		}catch (SQLException   e) {
			log.log(Level.SEVERE, e.getMessage());
		}
		return isSuccess;
	}

	public static List<User> getUser(String username, String password) throws ParserConfigurationException{
		
		ArrayList<User> user = new ArrayList<>();
		
		 
		try {
			 
			
			con = DBConnect.getConnection();
			stmt =con.createStatement();
		
			
			String sql= "select * from user where username='"+username+"'and password ='"+password+"'";
			 
			rs=stmt.executeQuery(sql);
			
			while(rs.next()) {
				int iduser = rs.getInt(1);
				String name=rs.getString(2);
				String email=rs.getString(3);
				String phone=rs.getString(4);
				String userU=rs.getString(5);
				String passU=rs.getString(6);
				
				
				User u = new User(iduser,name,email,phone,userU,passU);
				user.add(u);
			}
			
		}catch (SQLException e) {
			log.log(Level.SEVERE, e.getMessage());
		}
		
		
		return user;
	}
	//create database connection to store user details to database
	public static boolean insertUser(String name,String email,String phone,String username,String password) {
		boolean isSuccess =false;
		 
		
		try {
			 
			con = DBConnect.getConnection();
			stmt =con.createStatement();
			
			String sql ="insert into user values (0,'"+name+"','"+email+"','"+phone+"','"+username+"','"+password+"')";
			int rs=stmt.executeUpdate(sql);
			
			if(rs > 0) {
				isSuccess = true;
			}else {
				isSuccess =false;
			}
				
				
		}catch (SQLException e) {
			log.log(Level.SEVERE, e.getMessage());
		}
		
		return isSuccess;
	}
	//data update
	public static boolean updateUser(String iduser,String name,String email,String phone,String username,String password) {
		
		try {
			con = DBConnect.getConnection();
			stmt =con.createStatement();
			
			String sql="update user set name='"+name+"',email='"+email+"',phone='"+phone+"',username='"+username+"',password='"+password+"'where iduser='"+iduser+"' ";
			int rs=stmt.executeUpdate(sql);
			
			if(rs > 0) {
				isSuccess = true;
			}else {
				isSuccess =false;
			}
			
		}catch (SQLException e) {
			log.log(Level.SEVERE, e.getMessage());
		}
		
		return isSuccess;
	}
	//data retrieve
	public static List<User> getUserDetails(String Id){
		
		int convertedID =Integer.parseInt(Id);
		
		ArrayList<User> u = new ArrayList<>();
		
		try {
			
			con = DBConnect.getConnection();
			stmt =con.createStatement();
			
			String sql="select * from user where iduser ='"+convertedID+"'";
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				int iduser= rs.getInt(1);
				String name =rs.getString(2);
				String email =rs.getString(3);
				String phone =rs.getString(4);
				String username =rs.getString(5);
				String password =rs.getString(6);
				
				User us = new User(iduser, name,email,phone,username,password);
				u.add(us);
			}
			
		}catch (SQLException e) {
			log.log(Level.SEVERE, e.getMessage());
		}
		
		return u;
	}
	
	//data delete
	public static boolean deleteuser(String iduser) {
		
		int convId =Integer.parseInt(iduser);
		
		try {
			
			con = DBConnect.getConnection();
			stmt =con.createStatement();
			
			String sql="delete from user where iduser='"+convId+"'";
			
			int r=stmt.executeUpdate(sql);
			
			if(r >0) {
				isSuccess =true;
			}else {
				isSuccess=false;
			}
			
		}catch (SQLException e) {
			log.log(Level.SEVERE, e.getMessage());
		}
		
		return isSuccess;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

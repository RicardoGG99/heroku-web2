package controllers;

<<<<<<< HEAD
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import helpers.Conexion;
import helpers.PasswordHashing;
import helpers.PropertiesReader;

public class UserManager {
	PropertiesReader properties = new PropertiesReader();
    Conexion conn = new Conexion();
    Connection connection = conn.getConnection();
    PasswordHashing ph = new PasswordHashing();
    PropertiesReader pr = new PropertiesReader();
    
    public boolean insert(String username, String password, String email) {
=======

import java.sql.Connection;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import helpers.Conexion;


public class UserManager {
    Conexion conn = new Conexion();
    Connection connection = conn.getConnection();
    
    
    public boolean register(String username, String password, String email) {
>>>>>>> da31533... Initialize
    	String sentence = "INSERT INTO registro (username, pass, email) VALUES (?, ?, ?)";
		boolean result = false;
		
		try {
			PreparedStatement ps = connection.prepareStatement(sentence);
			ps = connection.prepareStatement(sentence);
			ps.setString(1, username);
			ps.setString(2, password);
			ps.setString(3, email);
			ps.executeUpdate();
			result = true; 
<<<<<<< HEAD
			System.out.println(pr.getResult("registro"));
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(pr.getResult("registro"));
=======
			ps.close();
		} catch (SQLException e) {
			result = false;
>>>>>>> da31533... Initialize
		}
		
		return result;
	}
<<<<<<< HEAD
=======
    
    public boolean login(String username, String password) {
    	String sentence1 = "SELECT * FROM registro WHERE username = ? AND pass = ?";
    	String sentence2 = "SELECT * FROM registro WHERE email = ? AND pass = ?";
    	boolean result = false;
    	boolean result1 = false;
    	boolean result2 = false;
    	ResultSet rs1 = null;
    	ResultSet rs2= null;
    	PreparedStatement ps1 = null;
    	PreparedStatement ps2 = null;
    	
    	try {
			ps1 = connection.prepareStatement(sentence1);
			ps1.setString(1, username);
			ps1.setString(2, password);
			rs1 = ps1.executeQuery();
			
			if(rs1.next()) {
				result1 = true;
			}
			
			ps2 = connection.prepareStatement(sentence2);
			ps2.setString(1, username);
			ps2.setString(2, password);
			rs2 = ps2.executeQuery();
			
			if(rs2.next()) {
				result2 = true;
			}
			
			if(result1 || result2 == true) {
				result = true;
			}else
				if(result1 && result2 == false) {
					result = false;
				}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
    	
    	return result;
    }
    
>>>>>>> da31533... Initialize
}

package com.admin;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.customer.DBConnect;

public class adminDBUtil {
	
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	public static List<Admin>validate(String userName, String password){
		
		ArrayList<Admin> adm = new ArrayList<>();
		
		
		//Validate
		
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from admin where username = '"+userName+"' and password = '"+password+"'";
			rs = stmt.executeQuery(sql);
			
			if(rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String email = rs.getString(3);
				String phone = rs.getString(4);
				String username = rs.getString(5);
				String Password = rs.getString(6);
				
				Admin a = new Admin(id, name, email, phone, username,Password);
				adm.add(a);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return adm;
	}
	
public static boolean bvalidate(String userName, String password){
		
		boolean isSuccess = false;
		
		
		//Validate
		
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from admin where username = '"+userName+"' and password = '"+password+"'";
			rs = stmt.executeQuery(sql);
			
			if(rs.next()) {
				isSuccess = true;
			}else {
				isSuccess = false;
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
	}
	
}

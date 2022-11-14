package com.customer;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class customerDBUtil {
	
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	public static List<Customer>validate(String userName, String password){
		
		ArrayList<Customer> cus = new ArrayList<>();
		
		//Validate
		
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from customer where username = '"+userName+"' and password = '"+password+"'";
			rs = stmt.executeQuery(sql);
			
			if(rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String email = rs.getString(3);
				String phone = rs.getString(4);
				String username = rs.getString(5);
				String Password = rs.getString(6);
				
				Customer c = new Customer(id, name, email, phone, username,Password);
				cus.add(c);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return cus;
	}
	
	//Insert Data -- Register Page
	
	public static boolean insertcustomer(String name, String email, String phone, String username, String Password) {
		
		boolean isSuccess = false;

				
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "insert into customer values (0,'"+name+"','"+email+"','"+phone+"','"+username+"','"+Password+"')";
			int rs = stmt.executeUpdate(sql);
			
			if(rs > 0) {
				isSuccess = true;
			}else {
				isSuccess = false;
			}
			
		}catch(Exception e){
			e.printStackTrace();			
		}

		return isSuccess;
	}
	
		//Update Data -- Update Page
	
	public static boolean updatecustomer(String id, String name, String email, String phone, String username, String Password){
		boolean isSuccess = false;
		
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "update customer set name ='"+name+"',email = '"+email+"',phone = '"+phone+"',username = '"+username+"',Password = '"+Password+"'"
					+ "where id = '"+id+"'";
			int rs = stmt.executeUpdate(sql);
			
			if(rs > 0) {
				isSuccess = true;
			}else {
				isSuccess = false;
			}
			
		}catch(Exception e){
			e.printStackTrace();			
		}
		
		return isSuccess;
	}
	
	
	//Retrieve Data
	
	
	public static List <Customer> getCustomerDetails(String id){
		
		int convertedid = Integer.parseInt(id);
		
		ArrayList<Customer> cus = new ArrayList<>();
		
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from customer where id = '"+convertedid+"'";
			rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				int cid = rs.getInt(1);
				String name = rs.getString(2);
				String email = rs.getString(3);
				String phone = rs.getString(4);
				String username = rs.getString(5);
				String password = rs.getString(6);
				
				Customer c = new Customer( cid, name, email, phone, username, password);
				cus.add(c);
			}
			
		}catch(Exception e){
			e.printStackTrace();			
		}
		
		return cus;
		
	}
	
	//Delete Account -- Delete Page
	
	public static boolean deleteCustomer(String id) {
		boolean isSuccess = false;
		int convertedid = Integer.parseInt(id);
		
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "delete from customer where id = '"+convertedid+"'";
			int r = stmt.executeUpdate(sql);
			
			if( r > 0 ) {
				isSuccess = true;
			}else {
				isSuccess = false;
			}
			
		}catch(Exception e){
			e.printStackTrace();			
		}
		
		return isSuccess;
	}
	
	//validate return boolean value

		public static boolean bvalidate(String userName, String password){
		boolean isSuccess = false;
		//Validate
		
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from customer where username = '"+userName+"' and password = '"+password+"'";
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


		



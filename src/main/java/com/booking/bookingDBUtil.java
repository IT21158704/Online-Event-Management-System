package com.booking;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.customer.DBConnect;
import com.event.event;

public class bookingDBUtil {
			
		private static Connection con = null;
		private static Statement stmt = null;
		private static ResultSet rs = null;
		
		//Insert Event -- Event Page

			public static boolean addBooking(String eid, String cid, String type, String date, String discription, String venue ) {
				
				boolean isSuccess = false;

						
				try {
					con = DBConnect.getConnection();
					stmt = con.createStatement();
					String sql = "insert into booking values ('"+eid+"','"+cid+"','"+type+"','"+date+"','"+discription+"','"+venue+"')";
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
			
			//Validate
			
			public static List<booking> Validate(String id){
				
				ArrayList<booking> book = new ArrayList<>();
				
				try {
					con = DBConnect.getConnection();
					stmt = con.createStatement();
					String sql = "select * from booking where bid = '"+id+"'";
					rs = stmt.executeQuery(sql);
					
					if(rs.next()) {
						int eid = rs.getInt(1);
						String cid = rs.getString(2);
						String name = rs.getString(3);
						String discription = rs.getString(4);
						String venue = rs.getString(5);
						String price = rs.getString(6);							
						
						booking c = new booking(eid, cid, name, discription, venue, price);
						book.add(c);
					}
					
				}catch(Exception e) {
					e.printStackTrace();
				}
				
				return book;
			}
			
			
			//Update
			
			public static boolean updateBooking(String eid, String cid, String type, String date, String discription, String venue){
				boolean isSuccess = false;
				
				try {
					con = DBConnect.getConnection();
					stmt = con.createStatement();
					String sql = "update booking set cid = '"+cid+"', type ='"+type+"', date = '"+date+"', discription = '"+discription+"', venue ='"+venue+"'" + " where bid = '"+eid+"'";
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
			
			//Delete
			
			public static boolean deleteBooking(String id) {
				boolean isSuccess = false;
				int convertedid = Integer.parseInt(id);
				
				try {
					con = DBConnect.getConnection();
					stmt = con.createStatement();
					String sql = "delete from booking where bid = '"+convertedid+"'";
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
}


package com.event;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.customer.DBConnect;

public class eventDBUtil {
	
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	//Insert Event -- Event Page

		public static boolean insertEvent(String id, String name, String discription, String venue, String price ) {
			
			boolean isSuccess = false;

					
			try {
				con = DBConnect.getConnection();
				stmt = con.createStatement();
				String sql = "insert into event values ('"+id+"','"+name+"','"+discription+"','"+venue+"','"+price+"')";
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
		
				public static List<event> Validate(String id){
					
					ArrayList<event> event = new ArrayList<>();
					
					try {
						con = DBConnect.getConnection();
						stmt = con.createStatement();
						String sql = "select * from event where eid = '"+id+"'";
						rs = stmt.executeQuery(sql);
						
						if(rs.next()) {
							int eid = rs.getInt(1);
							String name = rs.getString(2);
							String discription = rs.getString(3);
							String venue = rs.getString(4);
							String price = rs.getString(5);							
							
							event c = new event(eid, name, discription, venue, price);
							event.add(c);
						}
						
					}catch(Exception e) {
						e.printStackTrace();
					}
					
					return event;
				}
				
				//Validate
				
				public static List<event> ValidatebyName(String name){
					
					ArrayList<event> event = new ArrayList<>();
					
					try {
						con = DBConnect.getConnection();
						stmt = con.createStatement();
						String sql = "select * from event where name = '"+name+"'";
						rs = stmt.executeQuery(sql);
						
						if(rs.next()) {
							int eid = rs.getInt(1);
							String ename = rs.getString(2);
							String discription = rs.getString(3);
							String venue = rs.getString(4);
							String price = rs.getString(5);							
							
							event e = new event(eid, ename, discription, venue, price);
							event.add(e);
						}
						
					}catch(Exception e) {
						e.printStackTrace();
					}
					
					return event;
				}
				
				//Update
				
				public static boolean updateEvent(String id, String discription, String venue, String price){
					boolean isSuccess = false;
					
					try {
						con = DBConnect.getConnection();
						stmt = con.createStatement();
						String sql = "update event set discription = '"+discription+"', venue ='"+venue+"', price ='"+price+"'" + " where eid = '"+id+"'";
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
				
				
				public static boolean deleteEvent(String id) {
					boolean isSuccess = false;
					int convertedid = Integer.parseInt(id);
					
					try {
						con = DBConnect.getConnection();
						stmt = con.createStatement();
						String sql = "delete from event where eid = '"+convertedid+"'";
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

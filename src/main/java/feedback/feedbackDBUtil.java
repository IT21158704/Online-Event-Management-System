package feedback;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.customer.Customer;
import com.customer.DBConnect;


public class feedbackDBUtil {
	
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	//Insert Feedback -- Feedback Page

		public static boolean insertfeedback(String id, String name, String feedback ) {
			
			boolean isSuccess = false;

					
			try {
				con = DBConnect.getConnection();
				stmt = con.createStatement();
				String sql = "insert into feedback values (0,'"+id+"','"+name+"','"+feedback+"')";
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
//------------------------------------------------------------------------------------------------------------------------------
		//Validate
		
		public static List<feedback> validate(String cid){
			
			ArrayList<feedback> fee = new ArrayList<>();
			
			try {
				con = DBConnect.getConnection();
				stmt = con.createStatement();
				String sql = "select * from feedback where feedbackid = '"+cid+"'";
				rs = stmt.executeQuery(sql);
				
				if(rs.next()) {
					int fid = rs.getInt(1);
					String cusid = rs.getString(2);
					String name = rs.getString(3);
					String feedback = rs.getString(4);
					
					feedback c = new feedback(fid, cusid, name, feedback);
					fee.add(c);
				}
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			return fee;
		}

		//------------------------------------------------------------------------------------------------------------------------
		//validate return boolean value

		public static boolean bfeedback(String cid){
		boolean isSuccess = false;
		//Validate
		
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from feedback where feedbackid = '"+cid+"'";
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
		//------------------------------------------------------------------------------------------------------------------------
		// Update
		
		
		public static boolean updateFeedback(String id, String cid, String name, String feedback){
			boolean isSuccess = false;
			
			try {
				con = DBConnect.getConnection();
				stmt = con.createStatement();
				String sql = "update feedback set feedback = '"+feedback+"'" + "where feedbackid = '"+id+"'";
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
		
		//Delete Feedback -- Delete Page
		
		public static boolean deleteFeedback(String id) {
			boolean isSuccess = false;
			int convertedid = Integer.parseInt(id);
			
			try {
				con = DBConnect.getConnection();
				stmt = con.createStatement();
				String sql = "delete from feedback where feedbackid = '"+convertedid+"'";
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

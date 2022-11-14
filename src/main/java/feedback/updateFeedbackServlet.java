package feedback;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import com.customer.Customer;
import com.customer.customerDBUtil;


public class updateFeedbackServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id =  request.getParameter("cID");
		String cid =  request.getParameter("cusID");
		String name =  request.getParameter("cusName");
		String feedback =  request.getParameter("cusFeedback");
		
		boolean isTrue = feedbackDBUtil.updateFeedback( id, cid, name, feedback);
		
		if(isTrue == true){
			
			List<feedback> fbkDetails = feedbackDBUtil.validate(id);
			request.setAttribute("fbkDetails", fbkDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("viewFeedback.jsp");
			dis.forward(request, response);
			
		}else {

			List<feedback> fbkDetails = feedbackDBUtil.validate(id);
			request.setAttribute("fbkDetails", fbkDetails);
			
			RequestDispatcher dis2 = request.getRequestDispatcher("viewFeedback.jsp");
			dis2.forward(request, response);
						
		}
		
	}

}
